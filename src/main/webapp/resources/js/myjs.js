Utils = function () {

}
Utils.postToUrl = function (url, params, method) {
    method = method || "POST";
    var form = document.createElement("form");
    form.setAttribute("method", method);
    form.setAttribute("action", url);
    for (var key in params) {
        var hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", key);
        hiddenField.setAttribute("value", params[key]);
        form.appendChild(hiddenField);

    }
    document.body.appendChild(form);
    form.submit();
}

Home = function () {

};
Article = function () {

};
Search = function () {

};
SideBarSticky = function () {

    var obj = $('#sticky');
    //var warning = $('#warning');
    //var offsetWarning = warning.offset();
    var offset = obj.offset();
    var topOffset = offset.top;
    var leftOffset = offset.left;
    var topFooterOffset = $('#footer').offset().top;
    var h = obj.height();
    var marginTop = obj.css("marginTop");
    var marginLeft = obj.css("marginLeft");

    $(window).scroll(function () {
        var scrollTop = $(window).scrollTop();
        /*warning.css({
            top:scrollTop,
        });*/
        if (scrollTop >= topOffset + h * 2) {
            obj.css({
                marginTop: scrollTop + 15,
            });
            topOffset = scrollTop;
        }
        if (scrollTop <= topOffset) {
            obj.css({
                marginTop: scrollTop,
            });
            topOffset = scrollTop;
        }

    });
};
Home.prototype.init = function () {
    var self = this;
    SideBarSticky();
    /*$("#enterSite").on("click",function(e){
        $("#warning").css('visibility','hidden');
    });*/
    /*$(".post-url").on("click",function(e){
        e.preventDefault();
        var url = $(this).attr("href");
        var data = {
            "articleId":$(this).attr("articleId")
        }
        //alert(JSON.stringify(data));
        Utils.postToUrl(url,data,"POST");
    });*/
    $("#search").keydown(function (e) {
        if (e.which == 13) {
            //post data to server right here
            var keyword = $(this).val();
            var url = $(this).attr("url");
            var data = {
                'keyword': keyword
            }
            Utils.postToUrl(url, data, "GET");
        }
    });

};
Article.prototype.init = function () {
    var self = this;
    SideBarSticky();
    $(".fbShare").on("click", function (e) {
        e.preventDefault();

    });
    $("#search").keydown(function (e) {
        if (e.which == 13) {
            //post data to server right here
            var keyword = $(this).val();
            var url = $(this).attr("url");
            var data = {
                'keyword': keyword
            }
            Utils.postToUrl(url, data, "GET");
        }
    });

};
Search.prototype.init = function () {
    var self = this;
    SideBarSticky();
    $("#search").keydown(function (e) {
        if (e.which == 13) {
            //post data to server right here
            var keyword = $(this).val();
            var url = $(this).attr("url");
            var data = {
                'keyword': keyword
            }
            Utils.postToUrl(url, data, "GET");
        }
    });

};
FacebookShareButton = function (url, title, descr, image, winWidth, winHeight) {
    var winTop = (screen.height / 2) - (winHeight / 2);
    var winLeft = (screen.width / 2) - (winWidth / 2);
    window.open('http://www.facebook.com/sharer.php?s=100&p[title]=' + title + '&p[summary]=' + descr + '&p[url]=' + url + '&p[images][0]=' + image, 'sharer', 'top=' + winTop + ',left=' + winLeft + ',toolbar=0,status=0,width=' + winWidth + ',height=' + winHeight);
}