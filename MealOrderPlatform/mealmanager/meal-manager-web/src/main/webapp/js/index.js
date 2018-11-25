$(function () {

    var $li=$(".page-sidebar-menu .my-menu");
    var $hid=$(".hid");
    $li.eq(0).click(function () {
        var $div=$hid.eq(0);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        $li.eq(0).addClass("active");
        // $li.eq(0).siblings().addClass("close");
        // $li.eq(0).siblings().removeClass("open");
        $li.eq(0).siblings().removeClass("active");

        $.ajax({
           url:"/news",
           type:"get",
           dataType:"json",
           success:function (result) {
               var $new=$(".hid .news");
               $new.empty();
               console.log(result);
               for (var i = 0; i <result.length ; i++) {
                   var userKind=result[i].userkind;
                   var iclass;
                   var kind;
                   if(userKind==1){
                       iclass="icon-present";
                       kind="商家系统中"
                   }
                   if(userKind==2){
                       iclass="fa fa-motorcycle";
                       kind="骑手系统中";
                   }
                   var newstime=new Date(result[i].newstime);
                   var time=newstime.getFullYear()+"-"+newstime.getMonth()+"-"+newstime.getDate()+" "+newstime.getHours()+":"+newstime.getMinutes()+":"+newstime.getSeconds();
                   var domcontent=kind+" 用户 "+result[i].username+" 在 "+time+" "+result[i].action+" "+result[i].actionobject;
                   var content='<li>'+
                                    '<div class="task-checkbox"><i class="'+iclass+'"></i></div>'+
                                    '<div class="task-title">' +
                                    '<span class="task-title-sp">'+domcontent+'</span>'+
                                    '</div>'+
                               '</li>';
                   $new.append(createEle(content));
               }
           },
           error:function (result) {

           }

        });

    })
    $li.eq(1).click(function () {
        var $div=$hid.eq(1);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开商家");
    });
    $li.eq(2).click(function () {
        var $div=$hid.eq(2);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开骑手");
    });
    $li.eq(3).click(function () {
        var $div=$hid.eq(3);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开任务");
        getSomeTasks(10);
    });
    $li.eq(4).click(function () {
        var $div=$hid.eq(4);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开个人信息");
    });
    $li.eq(0).trigger("click");

    var $sellerModal=$("#sellerModal");
    $sellerModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        console.log($a);

    })
});