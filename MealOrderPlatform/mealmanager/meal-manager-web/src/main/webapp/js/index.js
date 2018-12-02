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

    });
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
    var $sellerTask=$("#sellerTask");
    var $riderTask=$("#riderTask");
    var $foodTask=$("#foodTask");
    var $confirm=$("#Confirm");
    var $reason=$("#reason");
    $sellerModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        getSellerById(id);

    });
    $riderModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        getRiderById(id);

    });
    $foodModal.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var food=$a.data("id");
        var seller=$a.data("seller");
        var tag=$a.data("tag");

        getFoodById(food);
        getSellerByIdF(seller);
        getTagById(tag);

    });

    $sellerTask.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        var task=$a.data("task");
        var status=$a.data("status");
        getSellerTaskById(id,status,task);

    });
    $riderTask.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        var task=$a.data("task");
        var status=$a.data("status");
        getRiderTaskById(id,status,task);

    });
    $foodTask.on('show.bs.modal',function (event) {

        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        var task=$a.data("task");
        var status=$a.data("status");
        getFoodAndSellerById(id,status,task);
        

    });

    $confirm.on('show.bs.modal',function (event) {
        $("#reason .modal-footer button").eq(1).trigger('click');
        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        var task=$a.data("task");
        var kind=$a.data("kind");
        var action=$a.data("status");

        var $buttoncon=$("#Confirm .modal-footer .btn-confirm");
        $buttoncon.data("id",id);
        $buttoncon.data("task",task);
        $buttoncon.data("kind",kind);
        $buttoncon.data("status",action);
    });
    $reason.on('show.bs.modal',function (event) {
        var $a=$(event.relatedTarget);
        var id=$a.data("id");
        var task=$a.data("task");
        var kind=$a.data("kind");

        var $buttonCon=$("#reason .modal-footer button");
        $buttonCon.eq(0).data("id",id);
        $buttonCon.eq(0).data("task",task);
        $buttonCon.eq(0).data("kind",kind);

    });
    var $confirmButton=$("#Confirm .modal-footer button");

    $confirmButton.eq(0).on('click',function () {
        var $submit=$(this);
        console.log($submit);
        var kind=$submit.data("kind");
        var task=$submit.data("task");
        var id=$submit.data("id");
        var action=$submit.data("status");

        if(kind=="seller"){
            if(action=="yes"){
                passSeller(id);
                doneTask(task);
            }
            if(action=="no"){
                var reasonL=$("#reason .modal-body input").val();
                console.log(reasonL);
                notpassSeller(id,reasonL);
                doneTask(task);
            }
        }
        if(kind=="rider"){
            if(action=="yes"){

                passRider(id);
                doneTask(task);
            }
            if(action=="no"){
                notpassRider(id);
                doneTask(task);
            }
        }
        if(kind=="food"){
            if(action=="yes"){
                passFood(id);
                doneTask(task);
            }
            if(action=="no"){
                notpassFood(id);
                doneTask(task);
            }
        }

    });
    $confirmButton.eq(1).on('click',function () {
        $("#reason .modal-footer button").eq(1).trigger('click');
    });

    var urls=new Array("/sellerInfo/","/riderInfo/","/userInfo/","/orderInfo/","/foodInfo/","/task/");
    var status=new Array(1,1,1,5,1,1);
    for (var i = 0; i <urls.length ; i++) {
        numberPane(urls[i]+"getSum",i,status[i]);
    }


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
            $("#foodModal .f_tag").text(tag);

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

            if(result.imgUrl!=null){
                $("#foodModal img").css(src,"imgUrl");
            }

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

            $("#foodModal .f_foodname").text(foodname);
            $("#foodModal .f_description").text(description);
            $("#foodModal .f_applicationtime").text(rtime);
            $("#foodModal .f_status").text(status);
            $("#foodModal .f_though").text(ttime);
            $("#foodModal .f_price").text(price);
            $("#foodModal .f_score").text(score);
            $("#foodModal .f_logout").text(ltime);

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

            $("#sellerModal .s_sellername").text(sellername);
            $("#sellerModal .s_name").text(name);
            $("#sellerModal .s_IDcard").text(idcard);
            $("#sellerModal .s_phone").text(phone);
            $("#sellerModal .s_address").text(address);
            $("#sellerModal .s_regtime").text(rtime);
            $("#sellerModal .s_status").text(status);
            $("#sellerModal .s_though").text(ttime);
            $("#sellerModal .s_score").text(score);
            $("#sellerModal .s_reason").text(reason);
            $("#sellerModal .s_logout").text(ltime);



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
            $("#foodModal .f_seller").text(sellername);

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

            $("#riderModal .r_ridername").text(ridername);
            $("#riderModal .r_phone").text(phone);
            $("#riderModal .r_sex").text(sex);
            $("#riderModal .r_address").text(address);
            $("#riderModal .r_regtime").text(rtime);
            $("#riderModal .r_status").text(status);
            $("#riderModal .r_though").text(ttime);
            $("#riderModal .r_currentstatus").text(curstatus);
            $("#riderModal .r_score").text(score);
            $("#riderModal .r_logout").text(ltime);

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}

function getSellerTaskById(id,sta,task) {

    $.ajax({

        url:"/sellerInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            if(result.imgUrl!=null){
                $("#sellerTask img").css(src,"imgUrl");
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

            $("#sellerTask .s_sellername").text(sellername);
            $("#sellerTask .s_name").text(name);
            $("#sellerTask .s_IDcard").text(idcard);
            $("#sellerTask .s_phone").text(phone);
            $("#sellerTask .s_address").text(address);
            $("#sellerTask .s_regtime").text(rtime);
            $("#sellerTask .s_status").text(status);
            $("#sellerTask .s_though").text(ttime);
            $("#sellerTask .s_score").text(score);
            $("#sellerTask .s_reason").text(reason);
            $("#sellerTask .s_logout").text(ltime);

            $("#sellerTask .oprow").remove();
            if(sta==0){

                var oprow='<div class="row oprow">' +
                          '<div class="col-md-4 col-sm-4"></div>'+
                          '<div class="col-md-2 col-sm-2">'+
                          '<button type="button" class="btn btn-primary btn-top" data-id="'+
                          result.id+'" data-task="'+task+'" data-kind="seller" data-status="yes" data-toggle="modal" data-target="#Confirm">通过</button>'+
                          '</div>'+
                          '<div class="col-md-2 col-sm-2">'+
                          '<button type="button" class="btn btn-primary btn-top" data-id="'+
                          result.id+'" data-task="'+task+'" data-kind="seller" data-status="no" data-toggle="modal" data-target="#reason">不通过</button>'+
                          '</div>'+
                          '<div class="col-md-4 col-sm-4"></div>'+
                          '</div>';


                $("#sellerTask .modal-body").append($(oprow));

            }




        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}
function getRiderTaskById(id,sta,task) {

    $.ajax({

        url:"/riderInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);
            if(result.imgUrl!=null){
                $("#riderTask img").css(src,"imgUrl");
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

            $("#riderTask .r_ridername").text(ridername);
            $("#riderTask .r_phone").text(phone);
            $("#riderTask .r_sex").text(sex);
            $("#riderTask .r_address").text(address);
            $("#riderTask .r_regtime").text(rtime);
            $("#riderTask .r_status").text(status);
            $("#riderTask .r_though").text(ttime);
            $("#riderTask .r_currentstatus").text(curstatus);
            $("#riderTask .r_score").text(score);
            $("#riderTask .r_logout").text(ltime);

            $("#riderTask .oprow").remove();
            if(sta==0){

                var oprow='<div class="row oprow">' +
                    '<div class="col-md-4 col-sm-4"></div>'+
                    '<div class="col-md-2 col-sm-2">'+
                    '<button type="button" class="btn btn-primary btn-top" data-id="'+
                    result.id+'" data-kind="rider"  data-task="'+task+'" data-status="yes" data-toggle="modal" data-target="#Confirm">通过</button>'+
                    '</div>'+
                    '<div class="col-md-2 col-sm-2">'+
                    '<button type="button" class="btn btn-primary btn-top" data-id="'+
                    result.id+'" data-kind="rider"  data-task="'+task+'" data-status="no" data-toggle="modal" data-target="#Confirm">不通过</button>'+
                    '</div>'+
                    '<div class="col-md-4 col-sm-4"></div>'+
                    '</div>';



                $("#riderTask .modal-body").append($(oprow));

            }

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}
function getFoodAndSellerById(id,sta,task) {

    $.ajax({

        url:"/foodandsellerInfo/byId/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log("success");
            console.log(result);

            if(result.imgUrl!=null){
                $("#foodTask img").css(src,"imgUrl");
            }

            var foodname=result.foodname==null?"":result.foodname;
            var description=result.description==null?"":result.description;
            var rtime="";
            if(result.applicationtime!=null){
                var regtime=new Date(result.applicationtime);

                var regtimeYMD=regtime.getFullYear()+"-"+regtime.getMonth()+"-"+regtime.getDate();
                var regtimeHMS=regtime.getHours()+":"+regtime.getMinutes()+":"+regtime.getSeconds();

                rtime=regtimeYMD+"  "+regtimeHMS;
            }
            var sellername=result.seller.sellername==null?"":result.seller.sellername;
            var tag=result.tag.classifytag==null?"":result.tag.classifytag;
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

            $("#foodTask .f_foodname").text(foodname);
            $("#foodTask .f_description").text(description);
            $("#foodTask .f_applicationtime").text(rtime);
            $("#foodTask .f_status").text(status);
            $("#foodTask .f_though").text(ttime);
            $("#foodTask .f_price").text(price);
            $("#foodTask .f_score").text(score);
            $("#foodTask .f_logout").text(ltime);
            $("#foodTask .f_tag").text(tag);
            $("#foodTask .f_seller").text(sellername);

            $("#foodTask .oprow").remove();
            if(sta==0){

                var oprow='<div class="row oprow">' +
                    '<div class="col-md-4 col-sm-4"></div>'+
                    '<div class="col-md-2 col-sm-2">'+
                    '<button type="button" class="btn btn-primary btn-top" data-id="'+
                    result.id+'" data-kind="food" data-task="'+task+'" data-status="yes" data-toggle="modal" data-target="#Confirm">通过</button>'+
                    '</div>'+
                    '<div class="col-md-2 col-sm-2">'+
                    '<button type="button" class="btn btn-primary btn-top" data-id="'+
                    result.id+'" data-kind="food" data-task="'+task+'" data-status="no" data-toggle="modal" data-target="#Confirm">不通过</button>'+
                    '</div>'+
                    '<div class="col-md-4 col-sm-4"></div>'+
                    '</div>';


                $("#foodTask .modal-body").append($(oprow));

            }

        },
        error:function (result) {
            console.log("error");
            console.log(result);
        }

    });

}

function passSeller(id){

    $.ajax({
       url:"/sellerInfo/though/"+id,
       type:"get",
       dataType:"json",
       success:function (result) {
           console.log(result);
           if(result==1){
               alert("提交成功");
           }
           else{
               alert("提交失败");
           }
           $("#Confirm .modal-footer button").eq(1).trigger('click');
           $("#sellerTask .modal-footer button").trigger('click');
           $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
       } ,
       error:function (result) {
           console.log(result);
       }
    });

}
function passRider(id){

    $.ajax({
        url:"/riderInfo/though/"+id,
        type:"get",
        dataType:"json",
        success:function (result) {
            console.log(result);
            if(result==1){
                alert("提交成功");
            }
            else{
                alert("提交失败");
            }
            $("#Confirm .modal-footer button").eq(1).trigger('click');
            $("#riderTask .modal-footer button").trigger('click');
            $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
        } ,
        error:function (result) {
            console.log(result);
        }
    });
}
function passFood(id){
    $.ajax({
        url:"/foodInfo/though/"+id,
        type:"get",
        dataType:"json",
        success:function (result) {
            console.log(result);
            if(result==1){
                alert("提交成功");
            }
            else{
                alert("提交失败");
            }
            $("#Confirm .modal-footer button").eq(1).trigger('click');
            $("#foodTask .modal-footer button").trigger('click');
            $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
        } ,
        error:function (result) {
            console.log(result);
        }
    });
}

function notpassSeller(id,reason){

    $.ajax({
        url:"/sellerInfo/notthough/"+id,
        type:"get",
        data:"reason="+reason,
        dataType:"json",
        success:function (result) {
            console.log(result);
            if(result==1){
                alert("提交成功");
            }
            else{
                alert("提交失败");
            }
            $("#Confirm .modal-footer button").eq(1).trigger('click');
            $("#sellerTask .modal-footer button").trigger('click');
            $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
        } ,
        error:function (result) {
            console.log(result);
        }
    });

}
function notpassRider(id){

    $.ajax({
        url:"/riderInfo/notthough/"+id,
        type:"get",
        dataType:"json",
        success:function (result) {
            console.log(result);
            if(result==1){
                alert("提交成功");
            }
            else{
                alert("提交失败");
            }
            $("#Confirm .modal-footer button").eq(1).trigger('click');
            $("#riderTask .modal-footer button").trigger('click');
            $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
        } ,
        error:function (result) {
            console.log(result);
        }
    });
}
function notpassFood(id){
    $.ajax({
        url:"/foodInfo/notthough/"+id,
        type:"get",
        dataType:"json",
        success:function (result) {
            console.log(result);
            if(result==1){
                alert("提交成功");
            }
            else{
                alert("提交失败");
            }
            $("#Confirm .modal-footer button").eq(1).trigger('click');
            $("#foodTask .modal-footer button").trigger('click');
            $(".page-sidebar-menu .my-menu").eq(4).trigger('click');
        } ,
        error:function (result) {
            console.log(result);
        }
    });
}

function doneTask(id) {

    $.ajax({

        url:"/task/done/"+id,
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log(result);
        },
        error:function (result) {
            console.log(result);
        }

    });

}

function numberPane(url,index,status){

    $.ajax({
        url:url,
        dataType:"json",
        data:"status="+status,
        type:"get",
        success:function (result) {
            console.log(result);
            if(result!=null){
                $(".stats-overview-cont .details .numbers").eq(index).text(result);
            }
        },
        error:function (result) {
            console.log(result);
        }
    });

}

function showTaskNum(adminId) {
    $.ajax({

        url:"/task/getAdminTask/"+adminId,
        data:"status=0",
        dataType:"json",
        type:"get",
        success:function (result) {
            console.log(result);
            if(result!=null){
                if(result>0){
                    var span='<span class="badge badge-success">'+result+'</span>';
                    $(".user ul li a").eq(1).append($(span));
                }
                else{
                    $(".user ul span").remove();
                }
            }
        },
        error:function (result) {
            console.log(result);
        }

    });

}