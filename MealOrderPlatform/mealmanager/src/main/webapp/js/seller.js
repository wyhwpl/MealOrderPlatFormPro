/***************************全部商家************************/

/*从后端获取数据*/
function  allSeller(data) {

    $.ajax({

        url:"/sellerInfo/all/0",
        type:"get",
        data:data,
        dataType:"json",
        success:function (result) {
            console.log(result);
            console.log("查询结束");

            var $tbody=$("#tab_1_0 tbody");
            var $page=$(".page1");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_0 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(0);

            var $li=$("#nav_1 li");
            var $tab=$li.eq(0);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");

            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            console.log(result.list);

            var pages;
            if(result.total%result.pageSize==0) pages=parseInt(result.total/result.pageSize);
            else pages=parseInt(result.total/result.pageSize)+1;
            $pageNav.empty();
            $pageInfo.remove();
            var pageNum=result.pageNum;
            var navMax=5;
            if(pages>=1){
                var info='<p class="page-info">'+'<span>'+result.pageNum+'页/'+pages+'页'+'</span></p>';
                $page.prepend(createEle(info));
                if(pageNum!=result.firstPage){
                    var first='<li><a href="javascript:;" aria-label="First" data-name="first"><span aria-hidden="true">&laquo;</span></a></li>';
                    var pre='<li><a href="javascript:;" aria-label="Previous" data-name="pre"><span aria-hidden="true">&lsaquo;</span></a></li>';
                    $pageNav.append(createEle(first));
                    $pageNav.append(createEle(pre));
                }

                if(pageNum<=navMax){

                    for (var i = 1; i <=(pages>=navMax?navMax:pages) ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+i+'">'+i+'</a></li>';
                        $pageNav.append(createEle(liNode));

                    }

                }
                else{
                    for (var i = 1; i <=navMax ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+(pageNum-navMax+i)+'">'+(pageNum-navMax+i)+'</a></li>';
                        $pageNav.append(createEle(liNode));
                    }
                }


                if(pageNum!=result.lastPage){
                    var next='<li><a href="javascript:;" aria-label="Next" data-name="next"><span aria-hidden="true">&rsaquo;</span></a></li>';
                    var end='<li><a href="javascript:;" aria-label="End" data-name="last"><span aria-hidden="true">&raquo;</span></a></li>';
                    $pageNav.append(createEle(next));
                    $pageNav.append(createEle(end));
                }
            }

            for (var i=0;i<result.list.length;i++) {
                var regtime=new Date(result.list[i].regtime);
                var statusCode=result.list[i].status;
                var status;
                if(statusCode==0) status="未审核";
                if(statusCode==1) status="通过审核";
                if(statusCode==2) status="未通过审核";
                if(statusCode==3) status="已注销";
                var elem="<tr>" +
                    "<td><a href='javascript:;'>"+result.list[i].id+"</a></td>" +
                    "<td>"+result.list[i].sellername+"</td>"+
                    "<td>"+result.list[i].name+"</td>"+
                    "<td>"+regtime.getFullYear()+"年"+regtime.getMonth()+"月"+regtime.getDate()+"日"+"</td>"+
                    "<td>"+status+"</td>"+
                    "<td><a href='javascript:;' data-toggle='modal' data-target='#sellerModal' data-id='"+result.list[i].id+"'>详情</a></td>"+
                    "</tr>";
                var $tr=createEle(elem);
                console.log($tr);
                $tbody.append($tr);
            }
            console.log($tbody);
            bindEvenAll(result);
        },
        error:function (result) {
            console.log(result);
            console.log("没有商家信息");
            var $tbody=$("#tab_1_0 tbody");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_0 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(0);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(0);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            $pageInfo.remove();
            $pageNav.empty();
        }

    });

}

/*为元素绑定监听实践*/
function bindEvenAll(result) {

    console.log("监听");
    console.log(result);
    var $pageNav=$(".page1 .page_1_0 ul li a");
    console.log($pageNav);
    for (var i = 0; i <$pageNav.length ; i++) {
        var $ele=$pageNav.eq(i);
        var name=$ele.data("name");
        console.log(name);
        var $pageUl=$(".page1 .page_1_0 ul");
        $pageUl.on("click",$ele,function () {
            var data;
            if(name=="first"){
                data="pageNum="+1+"&&pageSize="+result.pageSize;

            }
            else if(name=="pre"){
                data="pageNum="+(result.pageNum-1)+"&&pageSize="+result.pageSize;
            }

            else if(name=="next"){
                data="pageNum="+(result.pageNum+1)+"&&pageSize="+result.pageSize;
            }
            else if(name=="last"){
                data="pageNum="+result.lastPage+"&&pageSize="+result.pageSize;
            }
            else{
                data="pageNum="+name+"&&pageSize="+result.pageSize;
            }
            allSeller(data);
        });
    }

}

/***************************全部商家************************/

/***************************已审核商家************************/
/*从后端获取数据*/
function auditSeller(data) {
    $.ajax({

        url:"/sellerInfo/all/1",
        type:"get",
        data:data,
        dataType:"json",
        success:function (result) {
            console.log(result);
            console.log("查询结束");

            var $tbody=$("#tab_1_1 tbody");
            var $page=$(".page1");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_1 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(1);

            var $li=$("#nav_1 li");
            var $tab=$li.eq(1);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            console.log(result.list);

            var pages;
            if(result.total%result.pageSize==0) pages=parseInt(result.total/result.pageSize);
            else pages=parseInt(result.total/result.pageSize)+1;
            $pageNav.empty();
            $pageInfo.remove();
            var pageNum=result.pageNum;
            var navMax=5;
            if(pages>=1){
                var info='<p class="page-info">'+'<span>'+result.pageNum+'页/'+pages+'页'+'</span></p>';
                $page.prepend(createEle(info));
                if(pageNum!=result.firstPage){
                    var first='<li><a href="javascript:;" aria-label="First" data-name="first"><span aria-hidden="true">&laquo;</span></a></li>';
                    var pre='<li><a href="javascript:;" aria-label="Previous" data-name="pre"><span aria-hidden="true">&lsaquo;</span></a></li>';
                    $pageNav.append(createEle(first));
                    $pageNav.append(createEle(pre));
                }

                if(pageNum<=navMax){

                    for (var i = 1; i <=(pages>=navMax?navMax:pages) ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+i+'">'+i+'</a></li>';
                        $pageNav.append(createEle(liNode));

                    }

                }
                else{
                    for (var i = 1; i <=navMax ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+(pageNum-navMax+i)+'">'+(pageNum-navMax+i)+'</a></li>';
                        $pageNav.append(createEle(liNode));
                    }
                }


                if(pageNum!=result.lastPage){
                    var next='<li><a href="javascript:;" aria-label="Next" data-name="next"><span aria-hidden="true">&rsaquo;</span></a></li>';
                    var end='<li><a href="javascript:;" aria-label="End" data-name="last"><span aria-hidden="true">&raquo;</span></a></li>';
                    $pageNav.append(createEle(next));
                    $pageNav.append(createEle(end));
                }
            }

            for (var i=0;i<result.list.length;i++) {
                var regtime=new Date(result.list[i].regtime);
                var statusCode=result.list[i].status;
                var status;
                if(statusCode==0) status="未审核";
                if(statusCode==1) status="通过审核";
                if(statusCode==2) status="未通过审核";
                if(statusCode==3) status="已注销";
                var elem="<tr>" +
                    "<td><a href='javascript:;'>"+result.list[i].id+"</a></td>" +
                    "<td>"+result.list[i].sellername+"</td>"+
                    "<td>"+result.list[i].name+"</td>"+
                    "<td>"+regtime.getFullYear()+"年"+regtime.getMonth()+"月"+regtime.getDate()+"日"+"</td>"+
                    "<td>"+status+"</td>"+
                    "<td><a href='javascript:;' data-toggle='modal' data-target='#sellerModal' data-id='"+result.list[i].id+"'>详情</a></td>"+
                    "</tr>";
                var $tr=createEle(elem);
                console.log($tr);
                $tbody.append($tr);
            }
            console.log($tbody);
            bindEvenAudit(result);
        },
        error:function (result) {
            console.log(result);
            console.log("没有商家信息");
            var $tbody=$("#tab_1_1 tbody");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_1 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(1);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(1);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            $pageInfo.remove();
            $pageNav.empty();
        }

    });
}

/*为元素绑定监听实践*/
function bindEvenAudit(result) {
    console.log("监听");
    console.log(result);
    var $pageNav=$(".page1 .page_1_1 ul li a");
    console.log($pageNav);
    for (var i = 0; i <$pageNav.length ; i++) {
        var $ele=$pageNav.eq(i);
        var name=$ele.data("name");
        console.log(name);
        var $pageUl=$(".page1 .page_1_1 ul");
        $pageUl.on("click",$ele,function () {
            var data;
            if(name=="first"){
                data="pageNum="+1+"&&pageSize="+result.pageSize;

            }
            else if(name=="pre"){
                data="pageNum="+(result.pageNum-1)+"&&pageSize="+result.pageSize;
            }

            else if(name=="next"){
                data="pageNum="+(result.pageNum+1)+"&&pageSize="+result.pageSize;
            }
            else if(name=="last"){
                data="pageNum="+result.lastPage+"&&pageSize="+result.pageSize;
            }
            else{
                data="pageNum="+name+"&&pageSize="+result.pageSize;
            }
            auditSeller(data);
        });
    }
}

/***************************已审核商家************************/

/***************************未审核商家************************/
/*从后端获取数据*/
function notAuditSeller(data) {
    $.ajax({

        url:"/sellerInfo/all/2",
        type:"get",
        data:data,
        dataType:"json",
        success:function (result) {
            console.log(result);
            console.log("查询结束");

            var $tbody=$("#tab_1_2 tbody");
            var $page=$(".page1");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_2 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(2);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(2);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            console.log(result.list);

            var pages;
            if(result.total%result.pageSize==0) pages=parseInt(result.total/result.pageSize);
            else pages=parseInt(result.total/result.pageSize)+1;
            $pageNav.empty();
            $pageInfo.remove();
            var pageNum=result.pageNum;
            var navMax=5;
            if(pages>=1){
                var info='<p class="page-info">'+'<span>'+result.pageNum+'页/'+pages+'页'+'</span></p>';
                $page.prepend(createEle(info));
                if(pageNum!=result.firstPage){
                    var first='<li><a href="javascript:;" aria-label="First" data-name="first"><span aria-hidden="true">&laquo;</span></a></li>';
                    var pre='<li><a href="javascript:;" aria-label="Previous" data-name="pre"><span aria-hidden="true">&lsaquo;</span></a></li>';
                    $pageNav.append(createEle(first));
                    $pageNav.append(createEle(pre));
                }

                if(pageNum<=navMax){

                    for (var i = 1; i <=(pages>=navMax?navMax:pages) ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+i+'">'+i+'</a></li>';
                        $pageNav.append(createEle(liNode));

                    }

                }
                else{
                    for (var i = 1; i <=navMax ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+(pageNum-navMax+i)+'">'+(pageNum-navMax+i)+'</a></li>';
                        $pageNav.append(createEle(liNode));
                    }
                }


                if(pageNum!=result.lastPage){
                    var next='<li><a href="javascript:;" aria-label="Next" data-name="next"><span aria-hidden="true">&rsaquo;</span></a></li>';
                    var end='<li><a href="javascript:;" aria-label="End" data-name="last"><span aria-hidden="true">&raquo;</span></a></li>';
                    $pageNav.append(createEle(next));
                    $pageNav.append(createEle(end));
                }
            }

            for (var i=0;i<result.list.length;i++) {
                var regtime=new Date(result.list[i].regtime);
                var statusCode=result.list[i].status;
                var status;
                if(statusCode==0) status="未审核";
                if(statusCode==1) status="通过审核";
                if(statusCode==2) status="未通过审核";
                if(statusCode==3) status="已注销";
                var elem="<tr>" +
                    "<td><a href='javascript:;'>"+result.list[i].id+"</a></td>" +
                    "<td>"+result.list[i].sellername+"</td>"+
                    "<td>"+result.list[i].name+"</td>"+
                    "<td>"+regtime.getFullYear()+"年"+regtime.getMonth()+"月"+regtime.getDate()+"日"+"</td>"+
                    "<td>"+status+"</td>"+
                    "<td><a href='javascript:;' data-toggle='modal' data-target='#sellerModal' data-id='"+result.list[i].id+"'>详情</a></td>"+
                    "</tr>";
                var $tr=createEle(elem);
                console.log($tr);
                $tbody.append($tr);
            }
            console.log($tbody);
            bindEvenNotAudit(result);
        },
        error:function (result) {
            console.log(result);
            console.log("没有商家信息");
            var $tbody=$("#tab_1_2 tbody");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_2 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(2);

            var $li=$("#nav_1 li");
            var $tab=$li.eq(2);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            $pageInfo.remove();
            $pageNav.empty();
        }

    });
}

/*为元素绑定监听实践*/
function bindEvenNotAudit(result) {
    console.log("监听");
    console.log(result);
    var $pageNav=$(".page1 .page_1_2 ul li a");
    console.log($pageNav);
    for (var i = 0; i <$pageNav.length ; i++) {
        var $ele=$pageNav.eq(i);
        var name=$ele.data("name");
        console.log(name);
        var $pageUl=$(".page1 .page_1_2 ul");
        $pageUl.on("click",$ele,function () {
            var data;
            if(name=="first"){
                data="pageNum="+1+"&&pageSize="+result.pageSize;

            }
            else if(name=="pre"){
                data="pageNum="+(result.pageNum-1)+"&&pageSize="+result.pageSize;
            }

            else if(name=="next"){
                data="pageNum="+(result.pageNum+1)+"&&pageSize="+result.pageSize;
            }
            else if(name=="last"){
                data="pageNum="+result.lastPage+"&&pageSize="+result.pageSize;
            }
            else{
                data="pageNum="+name+"&&pageSize="+result.pageSize;
            }
            notAuditSeller(data);
        });
    }
}

/***************************未审核商家************************/

/***************************通过审核商家************************/
/*从后端获取数据*/
function thoughSeller(data) {
    $.ajax({

        url:"/sellerInfo/all/3",
        type:"get",
        data:data,
        dataType:"json",
        success:function (result) {
            console.log(result);
            console.log("查询结束");

            var $tbody=$("#tab_1_3 tbody");
            var $page=$(".page1");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_3 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(3);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(3);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            console.log(result.list);

            var pages;
            if(result.total%result.pageSize==0) pages=parseInt(result.total/result.pageSize);
            else pages=parseInt(result.total/result.pageSize)+1;
            $pageNav.empty();
            $pageInfo.remove();
            var pageNum=result.pageNum;
            var navMax=5;
            if(pages>=1){
                var info='<p class="page-info">'+'<span>'+result.pageNum+'页/'+pages+'页'+'</span></p>';
                $page.prepend(createEle(info));
                if(pageNum!=result.firstPage){
                    var first='<li><a href="javascript:;" aria-label="First" data-name="first"><span aria-hidden="true">&laquo;</span></a></li>';
                    var pre='<li><a href="javascript:;" aria-label="Previous" data-name="pre"><span aria-hidden="true">&lsaquo;</span></a></li>';
                    $pageNav.append(createEle(first));
                    $pageNav.append(createEle(pre));
                }

                if(pageNum<=navMax){

                    for (var i = 1; i <=(pages>=navMax?navMax:pages) ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+i+'">'+i+'</a></li>';
                        $pageNav.append(createEle(liNode));

                    }

                }
                else{
                    for (var i = 1; i <=navMax ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+(pageNum-navMax+i)+'">'+(pageNum-navMax+i)+'</a></li>';
                        $pageNav.append(createEle(liNode));
                    }
                }


                if(pageNum!=result.lastPage){
                    var next='<li><a href="javascript:;" aria-label="Next" data-name="next"><span aria-hidden="true">&rsaquo;</span></a></li>';
                    var end='<li><a href="javascript:;" aria-label="End" data-name="last"><span aria-hidden="true">&raquo;</span></a></li>';
                    $pageNav.append(createEle(next));
                    $pageNav.append(createEle(end));
                }
            }

            for (var i=0;i<result.list.length;i++) {
                var regtime=new Date(result.list[i].regtime);
                var statusCode=result.list[i].status;
                var status;
                if(statusCode==0) status="未审核";
                if(statusCode==1) status="通过审核";
                if(statusCode==2) status="未通过审核";
                if(statusCode==3) status="已注销";
                var elem="<tr>" +
                    "<td><a href='javascript:;'>"+result.list[i].id+"</a></td>" +
                    "<td>"+result.list[i].sellername+"</td>"+
                    "<td>"+result.list[i].name+"</td>"+
                    "<td>"+regtime.getFullYear()+"年"+regtime.getMonth()+"月"+regtime.getDate()+"日"+"</td>"+
                    "<td>"+status+"</td>"+
                    "<td><a href='javascript:;' data-toggle='modal' data-target='#sellerModal' data-id='"+result.list[i].id+"'>详情</a></td>"+
                    "</tr>";
                var $tr=createEle(elem);
                console.log($tr);
                $tbody.append($tr);
            }
            console.log($tbody);
            bindEvenThough(result);
        },
        error:function (result) {
            console.log(result);
            console.log("没有商家信息");
            var $tbody=$("#tab_1_3 tbody");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_3 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(3);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(3);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            $pageInfo.remove();
            $pageNav.empty();
        }

    });
}

/*为元素绑定监听实践*/
function bindEvenThough(result) {
    console.log("监听");
    console.log(result);
    var $pageNav=$(".page1 .page_1_3 ul li a");
    console.log($pageNav);
    for (var i = 0; i <$pageNav.length ; i++) {
        var $ele=$pageNav.eq(i);
        var name=$ele.data("name");
        console.log(name);
        var $pageUl=$(".page1 .page_1_3 ul");
        $pageUl.on("click",$ele,function () {
            var data;
            if(name=="first"){
                data="pageNum="+1+"&&pageSize="+result.pageSize;

            }
            else if(name=="pre"){
                data="pageNum="+(result.pageNum-1)+"&&pageSize="+result.pageSize;
            }

            else if(name=="next"){
                data="pageNum="+(result.pageNum+1)+"&&pageSize="+result.pageSize;
            }
            else if(name=="last"){
                data="pageNum="+result.lastPage+"&&pageSize="+result.pageSize;
            }
            else{
                data="pageNum="+name+"&&pageSize="+result.pageSize;
            }
            thoughSeller(data);
        });
    }
}

/***************************通过审核商家************************/

/***************************未通过审核商家************************/

/*从后端获取数据*/
function notThoughSeller(data) {
    $.ajax({

        url:"/sellerInfo/all/4",
        type:"get",
        data:data,
        dataType:"json",
        success:function (result) {
            console.log(result);
            console.log("查询结束");

            var $tbody=$("#tab_1_4 tbody");
            var $page=$(".page1");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_4 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(4);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(4);
            console.log($tab);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");
            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            console.log(result.list);

            var pages;
            if(result.total%result.pageSize==0) pages=parseInt(result.total/result.pageSize);
            else pages=parseInt(result.total/result.pageSize)+1;
            $pageNav.empty();
            $pageInfo.remove();
            var pageNum=result.pageNum;
            var navMax=5;
            if(pages>=1){
                var info='<p class="page-info">'+'<span>'+result.pageNum+'页/'+pages+'页'+'</span></p>';
                $page.prepend(createEle(info));
                if(pageNum!=result.firstPage){
                    var first='<li><a href="javascript:;" aria-label="First" data-name="first"><span aria-hidden="true">&laquo;</span></a></li>';
                    var pre='<li><a href="javascript:;" aria-label="Previous" data-name="pre"><span aria-hidden="true">&lsaquo;</span></a></li>';
                    $pageNav.append(createEle(first));
                    $pageNav.append(createEle(pre));
                }

                if(pageNum<=navMax){

                    for (var i = 1; i <=(pages>=navMax?navMax:pages) ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+i+'">'+i+'</a></li>';
                        $pageNav.append(createEle(liNode));

                    }

                }
                else{
                    for (var i = 1; i <=navMax ; i++) {
                        var liNode='<li><a href="javascript:;" data-name="'+(pageNum-navMax+i)+'">'+(pageNum-navMax+i)+'</a></li>';
                        $pageNav.append(createEle(liNode));
                    }
                }


                if(pageNum!=result.lastPage){
                    var next='<li><a href="javascript:;" aria-label="Next" data-name="next"><span aria-hidden="true">&rsaquo;</span></a></li>';
                    var end='<li><a href="javascript:;" aria-label="End" data-name="last"><span aria-hidden="true">&raquo;</span></a></li>';
                    $pageNav.append(createEle(next));
                    $pageNav.append(createEle(end));
                }
            }

            for (var i=0;i<result.list.length;i++) {
                var regtime=new Date(result.list[i].regtime);
                var statusCode=result.list[i].status;
                var status;
                if(statusCode==0) status="未审核";
                if(statusCode==1) status="通过审核";
                if(statusCode==2) status="未通过审核";
                if(statusCode==3) status="已注销";
                var elem="<tr>" +
                    "<td><a href='javascript:;'>"+result.list[i].id+"</a></td>" +
                    "<td>"+result.list[i].sellername+"</td>"+
                    "<td>"+result.list[i].name+"</td>"+
                    "<td>"+regtime.getFullYear()+"年"+regtime.getMonth()+"月"+regtime.getDate()+"日"+"</td>"+
                    "<td>"+status+"</td>"+
                    "<td><a href='javascript:;' data-toggle='modal' data-target='#sellerModal' data-id='"+result.list[i].id+"'>详情</a></td>"+
                    "</tr>";
                var $tr=createEle(elem);
                console.log($tr);
                $tbody.append($tr);
            }
            console.log($tbody);
            bindEvenNotThough(result);
        },
        error:function (result) {
            console.log(result);
            console.log("没有商家信息");
            var $tbody=$("#tab_1_4 tbody");
            var $pageInfo=$(".page1 .page-info");
            var $pageNav=$(".page1 .page_1_4 ul");
            var $pageNavDiv=$(".page1 div");
            var $div=$pageNavDiv.eq(4);
            var $li=$("#nav_1 li");
            var $tab=$li.eq(4);
            $tab.addClass("active");
            $tab.siblings().removeClass("active");

            $div.addClass("active");
            $div.siblings().removeClass("active");
            $tbody.empty();
            $pageInfo.remove();
            $pageNav.empty();
        }

    });
}

/*为元素绑定监听实践*/
function bindEvenNotThough(result) {
    console.log("监听");
    console.log(result);
    var $pageNav=$(".page1 .page_1_4 ul li a");
    console.log($pageNav);
    for (var i = 0; i <$pageNav.length ; i++) {
        var $ele=$pageNav.eq(i);
        var name=$ele.data("name");
        console.log(name);
        var $pageUl=$(".page1 .page_1_4 ul");
        $pageUl.on("click",$ele,function () {
            var data;
            if(name=="first"){
                data="pageNum="+1+"&&pageSize="+result.pageSize;

            }
            else if(name=="pre"){
                data="pageNum="+(result.pageNum-1)+"&&pageSize="+result.pageSize;
            }

            else if(name=="next"){
                data="pageNum="+(result.pageNum+1)+"&&pageSize="+result.pageSize;
            }
            else if(name=="last"){
                data="pageNum="+result.lastPage+"&&pageSize="+result.pageSize;
            }
            else{
                data="pageNum="+name+"&&pageSize="+result.pageSize;
            }
            notThoughSeller(data);
        });
    }
}

/***************************未通过审核商家************************/

function createEle(data) {
    return $(data);
}