function sayHello() {
   const name = document.querySelector("#name").value;
   const age = document.querySelector("#age").value;
   const user = {
      name,
      age
   }
   let network = fetch("/getUser", {
      method: "POST",
      headers: {
         "Content-Type": "application/json;charset=utf-8"
      },
      body: JSON.stringify(user)
   })
    .then((res) => {
       return res.json();
    })
    .then((result) => {
       document.querySelector("#nameLabel").innerText = result.user.name;
    })
    .catch((error) => {
       console.log("error =", error);
       console.error(error);
    })

};