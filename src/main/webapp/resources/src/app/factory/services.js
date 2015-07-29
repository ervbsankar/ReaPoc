angular.module('rea-services', [
    'ui.router',
    'placeholders',
    'ui.bootstrap',
    'ngResource'
])

    /*Below service is to get Match details*/
    .factory('matchGetService', function ($resource) {
        return $resource("/Spring/resources/match/:matchId/:teamId");
    })

    /*Below service is to save Match details*/
    .factory('matchHeadService', function ($resource) {
        return $resource("/Spring/resources/match/header");
    })

    /*Below service is to delete Match details*/
    .factory('matchDelService', function ($resource) {
        return $resource("/Spring/resources/match/:matchId/:teamId/:playerId");
    })

    .factory('scheduleService', function ($resource) {
        return $resource("/Spring/resources/schedule/:scheduleId", {}, {
            'delete': {method: 'DELETE'},
            'update': {method: 'UPDATE'},
            'get': {method: 'GET'}
        });
    })


;