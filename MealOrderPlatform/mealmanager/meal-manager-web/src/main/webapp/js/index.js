$(function () {

    var $li=$(".page-sidebar-menu .my-menu");
    var $hid=$(".hid");
    $li.eq(0).click(function () {
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
    })
    $li.eq(1).click(function () {
        var $div=$hid.eq(0);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开商家");
    });
    $li.eq(2).click(function () {
        var $div=$hid.eq(1);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开骑手");
    });
    $li.eq(3).click(function () {
        var $div=$hid.eq(2);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开任务");
    });
    $li.eq(4).click(function () {
        var $div=$hid.eq(3);
        for (var i = 0; i <$hid.length ; i++) {
            $hid.eq(i).addClass("hidden");
        }
        $div.removeClass("hidden");
        // alert("打开个人信息");
    });

});