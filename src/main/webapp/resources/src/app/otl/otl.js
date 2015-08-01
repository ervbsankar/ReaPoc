/**
 * Created by Sankar on 4/24/2015.
 */
angular.module('rea-otl', [
    'ui.router',
    'placeholders',
    'ui.bootstrap',
    'ngResource',
    'rea-services',
    'smart-table'
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


    .controller('OtlCrtl', function ($http, $scope, $state,otlService) {
      /*  $scope.flag = true;*/
   /* Below $scope.getAllYears is cloned across multiple scripts */
        $scope.getOtlList = function (dept,clas,item) {
            $scope.deptId = dept;
            $scope.clasId = clas;
            $scope.itemId = item;
            $scope.otlList = [];
            var getOtl = otlService.get({deptId: dept, clasId: clas, itemId: item}).$promise;
            getOtl.then(function onSuccess(response) {
                    $scope.otlList = response.otlList;
                    $scope.displayedCollection = [].concat($scope.otlList);
                },
                function onFail(response) {
                    console.log("It is failed");
                    console.log(response);
                });
        };

        $scope.disableCheck = function(newDept,newClas,newItem){
            console.log(newDept);
            if(angular.isUndefined(newDept)){
                $scope.flag = true;
                console.log("undefined");
            }
            if(angular.isString(newDept)){
                $scope.flag = true;
                console.log("String");
                console.log(value);
                if(angular.isNumber(newDept)){
                    $scope.flag = false;
                    console.log("number");
                }
            }

        };

       /*Below functions belongs to Calendar */
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