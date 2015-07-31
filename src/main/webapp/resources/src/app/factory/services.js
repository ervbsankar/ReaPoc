angular.module('rea-services', [
    'ui.router',
    'placeholders',
    'ui.bootstrap',
    'ngResource'
])

    .factory('otlService', function ($resource) {
        return $resource("/ReaPOC/resources/otl/:deptId/:clasId/:itemId", {}, {
            'delete': {method: 'DELETE'},
            'update': {method: 'UPDATE'},
            'get': {method: 'GET'}
        });
    })


;