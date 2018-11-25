function getAllTasks() {

    $.ajax({

        url:"/task/all",
        type:"get",
        dataType:"json",
        success:function (result) {
            if(result==null)return 0;

        },
        error:function (result) {

        }

    });

}
function getSomeTasks(data) {

    $.ajax({

        url:"/task/some",
        type:"get",
        data:"num="+data,
        dataType:"json",
        success:function (result) {
            if(result==null) return 0;
            console.log(result);
            buildTaskView(result);
        },
        error:function (result) {

        }

    });

}

function getTaskByExample(data) {

    $.ajax({

        url:"/task/byexample/"+data,
        type:"get",
        dataType:"json",
        success:function (result) {
            if(result==null) return 0;
            buildTaskView(result);
        },
        error:function (result) {

        }

    });

}

function buildTaskView(result) {

    var $task=$(".hid .tasks");
    $task.empty();
    console.log(result);
    for (var i = 0; i <result.length ; i++) {
        var taskKind=result[i].taskkind;
        var iclass;
        var kind;
        var action;
        if(taskKind==1){
            iclass="icon-present";
            kind="商家系统中 商家";
            action="申请注册"
        }
        if(taskKind==2){
            iclass="fa fa-motorcycle";
            kind="骑手系统中 骑手";
            action="申请注册";
        }
        if(taskKind==3){
            iclass="icon-present";
            kind="商家系统中 菜品";
            action="申请上架";
        }
        var stausLabel;
        if(result[i].status==0) stausLabel='<span class="label label-sm label-warning">未完成</span>';
        else stausLabel='<span class="label label-sm label-success">已完成</span>';
        var tasktime=new Date(result[i].tasktime);
        var time=tasktime.getFullYear()+"-"+tasktime.getMonth()+"-"+tasktime.getDate()+" "+tasktime.getHours()+":"+tasktime.getMinutes()+":"+tasktime.getSeconds();
        var domcontent=kind+result[i].username+" 在 "+time+" "+action+" ";
        var content='<li>'+
            '<div class="task-checkbox"><i class="'+iclass+'"></i></div>'+
            '<div class="task-title">' +
            '<span class="task-title-sp">'+domcontent+'</span>'+
            stausLabel+
            '</div>'+
            '</li>';
        $task.append(createEle(content));
    }

}