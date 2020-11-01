$('document').ready(function(){
    $('table #editButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function(country, status){
            $('#idEdit').val(country.id);
            $('#empnoEdit').val(country.empno);
            $('#enameEdit').val(country.ename);
            $('#jobEdit').val(country.job);
            $('#deptIdEdit').val(country.deptno);
        });
        $('#editModal').modal();
    });
});