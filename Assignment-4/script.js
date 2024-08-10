    var counter=1;
function addElemetsToDiv(){
    
    var div=document.getElementById("mainContainer");
    var newDiv=document.createElement("div"); 
   
    var input=document.createElement("input");
    input.name="Username";
    input.type="text";
    input.placeholder="Enter your name";
    input.id="myInput";
    input.style.height="30px";
    input.style.margin="20px 0px 0px 0px "
    input.value=counter;
    
    var btn=document.createElement("button");
    btn.name="Button";        
    btn.innerHTML="Remove Contents";
    btn.style.color="white"
    btn.style.border="1px solid black";
    btn.style.backgroundColor="red"
    btn.style.height="35px"
    btn.style.width="130px"
    btn.style.margin="10px 0px 0px 20px"
   
    newDiv.appendChild(input)
    newDiv.appendChild(btn);
    
    btn.addEventListener('click',function() {
        alert("You want to delete this input box ?") 
        newDiv.remove();
    });
    
    div.append(newDiv);
    counter++;
}

