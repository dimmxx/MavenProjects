function deleteItem(id) {

    var productId = document.getElementById(id).innerHTML;

    $.ajax({
        url: "./CartServletMulti",
        type: "GET",
        data: {productId: productId},
        dataType: "html", success: function (html) {
            location.reload();

        }
    });

}


function PassItem(id) {

    var product = document.getElementById(id);

    $.ajax({
        url: "./CartServletMulti",
        type: "GET",
        data: {productId: productId},
        dataType: "html", success: function (html) {
            location.reload();

        }
    });

}