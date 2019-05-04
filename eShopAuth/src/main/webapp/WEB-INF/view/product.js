function minus(id){
  var product = document.getElementById(id);
  var temp = +product.innerHTML - 1;
  product.innerHTML = temp;
}

function plus(id){
  var product = document.getElementById(id);
  var temp = +product.innerHTML + 1;
  product.innerHTML = temp;
}