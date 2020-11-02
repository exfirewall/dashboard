$('document').ready(function(){
    $('table #editButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(employee, status){
            $('#idEdit').val(employee.id);
            $('#empcodeEdit').val(employee.empCode);
            $('#enameEdit').val(employee.ename);
            $('#jobEdit').val(employee.job);
            $('#deptIdEdit').val(employee.deptId);
        });
        $('#editModal').modal();
    });
    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });

});