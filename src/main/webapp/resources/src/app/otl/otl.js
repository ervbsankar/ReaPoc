/**
 * Created by Sankar on 4/24/2015.
 */
angular.module('rea-otl', [
    'ui.router',
    'placeholders',
    'ui.bootstrap',
    'ngResource',
    'rea-services'
])

    .config(function config($stateProvider) {
        $stateProvider.state('otl', {
            url: '/otl',
            views: {
                "main": {
                    controller: 'OtlCrtl',
                    templateUrl: 'otl/otl.tpl.html'
                }
            },
            data: {pageTitle: 'Otl'}
        });
    })


    .controller('OtlCrtl', function ($http, $scope, $state, $rootScope) {

   /* Below $scope.getAllYears is cloned across multiple scripts */
        $scope.getAllYears = function () {
            $scope.yearList = [];
            $rootScope.yearList = [];
            var getYears = yearService.get().$promise;
            getYears.then(function onSuccess(response) {
                    $scope.yearList = response.years;
                },
                function onFail(response) {
                    console.log("It is failed"+response);
                });
        };

        $scope.addYear = function (newYear){
        var addYears = yearService.save({},{yearId : newYear}).$promise;
            addYears.then(function onSuccess(response) {
                    /*$state.go('team',{},{reload:true});*/
                    $state.transitionTo($state.current, {}, {
                        reload: true,
                        inherit: false,
                        notify: true
                    });
            },
                function onFail(response) {
                   console.log("Failed to Add"+response);
                });
        };

        /*jshint es5: true */

        $scope.removeYear = function (yearId) {
           var remYear = yearRemService.delete({yearId:yearId}).$promise;
            remYear.then(function onSuccess(response) {
                $state.transitionTo($state.current, {}, {
                    reload: true,
                    inherit: false,
                    notify: true
                });
            }, function onFail(response) {
                  console.log("Failed to remove"+response);
            });
        };

        $scope.removeAllYear = function() {
            var removeAll = yearService.delete().$promise;
            removeAll.then(function onSuccess(response) {
                $state.transitionTo($state.current, {}, {
                    reload: true,
                    inherit: false,
                    notify: true
                });
            }, function onFail(response){
                console.log("Failed to remove All" + response);
            });
        };


        $scope.today = function () {
            $scope.dt = new Date();
        };
        $scope.today();

        $scope.clear = function () {
            $scope.dt = null;
        };

        $scope.disabled = function (date, mode) {
            /* return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );*/
            return false;
        };

        $scope.open = function ($event) {
            $event.preventDefault();
            $event.stopPropagation();
        };

        $scope.dateOptions = {
            formatYear: 'yy',
            startingDay: 1
        };

    })
;