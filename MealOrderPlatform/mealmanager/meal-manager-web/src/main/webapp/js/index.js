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
        $("#nav_1 li a").eq(0).trigger("click");
        // alert("打开商家");
    });
    $li.eq(2).click(function () {
        var $div=$hid.eq(2);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        $("#nav_2 li a").eq(0).trigger("click");
        // alert("打开骑手");
    });
    $li.eq(3).click(function () {
        var $div=$hid.eq(3);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        $("#nav_3 li a").eq(0).trigger("click");
        // alert("打开菜品");
    });
    $li.eq(4).click(function () {
        var $div=$hid.eq(4);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开任务");
        getSomeTasks(10);
    });
    $li.eq(5).click(function () {
        var $div=$hid.eq(5);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开个人信息");
    });
    $li.eq(0).trigger("click");

    var $sellerModal=$("#sellerModal");
    var $riderModal=$("#riderModal");
    var $foodModal=$("#foodModal");
    $sellerModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        getSellerById(id);

    })
    $riderModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        getRiderById(id);

    })
    $foodModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var food=$a.data("id");
        var seller=$a.data("seller");
        var tag=$a.data("tag");

        getFoodById(food);
        getSellerByIdF(seller);
        getTagById(tag);

    })
});

function getTagById(id) {

    $.ajax({

        url:"/tag/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);

            var tag=result.classifytag==null?"":result.classifytag;
            $("#f_tag").text(tag);

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}

function getFoodById(id) {

    $.ajax({

        url:"/foodInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            var foodname=result.foodname==null?"":result.foodname;
            var description=result.description==null?"":result.description;
            var rtime="";
            if(result.applicationtime!=null){
                var regtime=new Date(result.applicationtime);

                var regtimeYMD=regtime.getFullYear()+"-"+regtime.getMonth()+"-"+regtime.getDate();
                var regtimeHMS=regtime.getHours()+":"+regtime.getMinutes()+":"+regtime.getSeconds();

                rtime=regtimeYMD+"  "+regtimeHMS;
            }

            var statusCode=result.status;
            var status;
            if(statusCode==0) status="未审核";
            if(statusCode==1) status="通过审核";
            if(statusCode==2) status="未通过审核";
            if(statusCode==3) status="已下架";

            var ttime="";
            if(result.thoughtime!=null){
                var thoughtime=new Date(result.thoughtime);

                var thoughtimeYMD=thoughtime.getFullYear()+"-"+thoughtime.getMonth()+"-"+thoughtime.getDate();
                var thoughtimeHMS=thoughtime.getHours()+":"+thoughtime.getMinutes()+":"+thoughtime.getSeconds();

                ttime=thoughtimeYMD+"  "+thoughtimeHMS;
            }

            var price=result.originPrice==null?"":result.originPrice;
            var score=result.score==null?"":result.score;

            var ltime="";
            if(result.undercarriagetime!=null){
                var logouttime=new Date(result.undercarriagetime);

                var logouttimeYMD=logouttime.getFullYear()+"-"+logouttime.getMonth()+"-"+logouttime.getDate();
                var logouttimeHMS=logouttime.getHours()+":"+logouttime.getMinutes()+":"+logouttime.getSeconds();

                ltime=logouttimeYMD+"  "+logouttimeHMS;
            }

            $("#f_foodname").text(foodname);
            $("#f_description").text(description);
            $("#f_applicationtime").text(rtime);
            $("#f_status").text(status);
            $("#f_though").text(ttime);
            $("#f_price").text(price);
            $("#f_score").text(score);
            $("#f_logout").text(ltime);

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}
function getSellerById(id) {

    $.ajax({

        url:"/sellerInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            if(result.imgUrl!=null){
                $("#sellerModal img").css(src,"imgUrl");
            }

            var sellername=result.sellername==null?"":result.sellername;
            var name=result.name==null?"":result.name;
            var idcard=result.idcard=null?"":result.idcard;
            var phone=result.phone=null?"":result.phone;
            var address=result.address==null?"":result.address;
            var rtime="";
            if(result.regtime!=null){
                var regtime=new Date(result.regtime);

                var regtimeYMD=regtime.getFullYear()+"-"+regtime.getMonth()+"-"+regtime.getDate();
                var regtimeHMS=regtime.getHours()+":"+regtime.getMinutes()+":"+regtime.getSeconds();

                rtime=regtimeYMD+"  "+regtimeHMS;
            }
            var statusCode=result.status;
            var status;
            if(statusCode==0) status="未审核";
            if(statusCode==1) status="通过审核";
            if(statusCode==2) status="未通过审核";
            if(statusCode==3) status="已注销";

            var ttime="";
            if(result.thoughtime!=null){
                var thoughtime=new Date(result.thoughtime);

                var thoughtimeYMD=thoughtime.getFullYear()+"-"+thoughtime.getMonth()+"-"+thoughtime.getDate();
                var thoughtimeHMS=thoughtime.getHours()+":"+thoughtime.getMinutes()+":"+thoughtime.getSeconds();

                ttime=thoughtimeYMD+"  "+thoughtimeHMS;
            }

            var reason=result.reason==null?"":result.reason;

            var score=result.score==null?"":result.score;

            var ltime="";
            if(result.logouttime!=null){
                var logouttime=new Date(result.logouttime);

                var logouttimeYMD=logouttime.getFullYear()+"-"+logouttime.getMonth()+"-"+logouttime.getDate();
                var logouttimeHMS=logouttime.getHours()+":"+logouttime.getMinutes()+":"+logouttime.getSeconds();

                ltime=logouttimeYMD+"  "+logouttimeHMS;
            }

            $("#s_sellername").text(sellername);
            $("#s_name").text(name);
            $("#s_IDcard").text(idcard);
            $("#s_phone").text(phone);
            $("#s_address").text(address);
            $("#s_regtime").text(rtime);
            $("#s_status").text(status);
            $("#s_though").text(ttime);
            $("#s_score").text(score);
            $("#s_reason").text(reason);
            $("#s_logout").text(ltime);



        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}
function getSellerByIdF(id) {

    $.ajax({

        url:"/sellerInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            var sellername=result.sellername==null?"":result.sellername;
            $("#f_seller").text(sellername);

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}
function getRiderById(id) {

    $.ajax({

        url:"/riderInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            if(result.imgUrl!=null){
                $("#riderModal img").css(src,"imgUrl");
            }
            var ridername=result.username==null?"":result.username;
            var phone=result.phone==null?"":result.phone;
            var sex=result.sex==null?"":result.sex;
            var address=result.address==null?"":result.address;
            var rtime="";
            if(result.regtime!=null){
                var regtime=new Date(result.regtime);

                var regtimeYMD=regtime.getFullYear()+"-"+regtime.getMonth()+"-"+regtime.getDate();
                var regtimeHMS=regtime.getHours()+":"+regtime.getMinutes()+":"+regtime.getSeconds();

                rtime=regtimeYMD+"  "+regtimeHMS;
            }

            var statusCode=result.status;
            var status;
            if(statusCode==0) status="未审核";
            if(statusCode==1) status="通过审核";
            if(statusCode==2) status="未通过审核";
            if(statusCode==3) status="已注销";

            var ttime="";
            if(result.thoughtime!=null){
                var thoughtime=new Date(result.thoughtime);

                var thoughtimeYMD=thoughtime.getFullYear()+"-"+thoughtime.getMonth()+"-"+thoughtime.getDate();
                var thoughtimeHMS=thoughtime.getHours()+":"+thoughtime.getMinutes()+":"+thoughtime.getSeconds();

                ttime=thoughtimeYMD+"  "+thoughtimeHMS;
            }
            var curstatus="";
            if(result.currentstatus!=null){
                var curstatusCode=result.currentstatus;

                if(curstatusCode==0) curstatus="未接单";
                if(curstatusCode==1) curstatus="前往商家取货";
                if(curstatusCode==2) curstatus="配送中";
            }
            var score=result.score==null?"":result.score;

            var ltime="";
            if(result.logouttime!=null){
                var logouttime=new Date(result.logouttime);

                var logouttimeYMD=logouttime.getFullYear()+"-"+logouttime.getMonth()+"-"+logouttime.getDate();
                var logouttimeHMS=logouttime.getHours()+":"+logouttime.getMinutes()+":"+logouttime.getSeconds();

                ltime=logouttimeYMD+"  "+logouttimeHMS;
            }

            $("#r_ridername").text(ridername);
            $("#r_phone").text(phone);
            $("#r_sex").text(sex);
            $("#r_address").text(address);
            $("#r_regtime").text(rtime);
            $("#r_status").text(status);
            $("#r_though").text(ttime);
            $("#r_currentstatus").text(curstatus);
            $("#r_score").text(score);
            $("#r_logout").text(ltime);

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}