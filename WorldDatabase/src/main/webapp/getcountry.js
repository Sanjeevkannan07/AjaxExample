let xhr = new XMLHttpRequest();

xhr.open("GET","Servlet");
xhr.send();

xhr.onload = function(){
	let obj = JSON.parse(xhr.response);
	districts = obj["@items"];
	filterStates();
}

const storage = document.querySelector(".container");


function filterStates(ele){
	let filteredstates = districts.filter(function(name){
    	return name.toLowerCase().includes(ele.value.toLowerCase());
});
		
	show(filteredstates);
}

let makeElement=(dname)=>{
      return `<div class="wrapper">${dname}</div>`;
}

let show=(arr)=>{
	let outputString = "";
	arr.forEach(function(name){
		outputString += makeElement(name);
	})
	storage.innerHTML = outputString;
}

storage.addEventListener("click", function(e){
    document.getElementById("inp").value = e.target.innerText;
});







