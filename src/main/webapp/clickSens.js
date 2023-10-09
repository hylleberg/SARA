async function postTemp() {
    let postform = document.getElementById("postform");
    const formData = new FormData(postform);
    const object = Object.fromEntries(formData);
    console.log(object);

    const res = await fetch("api/sensor/post", {
        method: "POST",
        body: JSON.stringify(object),
        headers: {
            "content-type": "application/json"
        }
    })

    const token = await res.text();
    if (res.status != 201) {

        document.getElementById("error").innerHTML = "error occured!";

    } else {


        document.getElementById("success").innerHTML = "POST succesful";
    }
}

async function fetchTemp(devID) {


    //   let bearer = "Bearer " + localStorage.getItem("token")
    const res = await fetch("api/sensor/fetch/1", {
        method: "GET",
        headers: {
            "content-type": "application/json"
        }
    })
    console.log(res)
    const json = await res.text();
    const obj = JSON.parse(json);
    console.log(res.status);
    if (res.status != 201) {

        document.getElementById("val").innerHTML = "database error!";

    } else {


        document.getElementById("val").innerHTML = obj;
    }
}



