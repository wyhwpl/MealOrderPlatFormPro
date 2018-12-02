function getAdminInfo(adminId) {

    var status=new Array(0,1);

    for (var i = 0; i <status.length ; i++) {
        getTotalTask(status[i],adminId,i);
    }

}

function adminInfo() {
    $(".page-sidebar-menu .my-menu .my-info").trigger('click');
}
function taskInfo() {
    $(".page-sidebar-menu .my-menu .my-task").trigger('click');
}

function getTotalTask(status,adminId,index) {

    $.ajax({

        url:"/task/getAdminTask/"+adminId,
        data:"status="+status,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log(result);
            if(result!=null){
                $(".tasknumber .number").eq(index).text(result);
            }
        },
        error:function (result) {
            console.log(result);
        }

    });
}

