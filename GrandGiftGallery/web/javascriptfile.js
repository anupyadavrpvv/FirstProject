//fuctin for payment page
function hide(x) {
    if (x === 0) {
        document.getElementById('onlineform').style.display = "none";
    } else {
        document.getElementById('onlineform').style.display = "block";

    }
}
function check1() {
    x = document.getElementById('t1').value;
    if (x === 0000000000000000 || x === "" || x.length > 16 || x.length < 16) {
        alert("Card No. should be of 16 digits");
    }
}
function check2() {
    y = document.getElementById('t2').value;
    if (y === "NONE" || y === "") {
        alert("Please Enter the Bank Holder Name");
    }
}
function check3() {
    z = document.getElementById('t3').value;
    if (z === 000 || z === "" || z < 3 || z > 3) {
        alert("CVV must be of 3 digits");
    }
}


//function for printing alert massages
function showMessage(str) {
    alert(str);
}


//function for signup page            
function validate()
{
    if (document.signup.city.value === "" || document.signup.city.value === "City") {
        alert("Please Choose a City");
        document.signup.city.focus();
        return false;
    }
    
    if (document.signup.confirmpass.value !== document.signup.password.value) {
        alert("Password doesn't Match!");
        return false;
    }
    passcheck();
    return true;
}



//funtion for orders and cart page
function hidetable() {
    
        document.getElementById('tab').style.display="none";
     
}
function hidediv() {
    
        document.getElementById('hid').style.display="none";
     
}

