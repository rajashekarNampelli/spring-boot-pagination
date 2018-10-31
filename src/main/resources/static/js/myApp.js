//  var app = angular.module('MyForm',['ui.bootstrap','ngResource']);  
//     app.controller('myCtrl','StudentService', function ($scope, StudentService) {  
//       $scope.predicate = 'name';  
//       $scope.reverse = true;  
//       $scope.currentPage = 1;  
//       $scope.order = function (predicate) {  
//         $scope.reverse = ($scope.predicate === predicate) ? !$scope.reverse : false;  
//         $scope.predicate = predicate;  
//       };  
//       $scope.students = [];
//       
//       StudentService.getStudents().then(successCallback,
//   			errorCallback);
//       function successCallback(response){
//           $scope.students = response;
//           console.log("success");
//       }, function errorCallback(response){
//           console.log("Unable to perform get request");
//       };
//    	   
//       $scope.totalItems = $scope.students.length;  
//       $scope.numPerPage = 5;  
//       $scope.paginate = function (value) {  
//         var begin, end, index;  
//         begin = ($scope.currentPage - 1) * $scope.numPerPage;  
//         end = begin + $scope.numPerPage;  
//         index = $scope.students.indexOf(value);  
//         return (begin <= index && index < end);  
//       };  
//     }); 
//     
//     
//     app.service('StudentService',['$http', function ($http) {
//    		
//    		function getStudents() {
//    	        return  $http({
//    	          method: 'GET',
//    	          url: '/getAll'
//    	        });
//    	    }
//    		
//    	    return {
//    	    	getStudents:getStudents
//    	    };
//    		
//    	}]);