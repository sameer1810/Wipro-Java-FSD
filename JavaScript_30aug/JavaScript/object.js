const user = {
    firstName : "Ram",
    lastName : "kumar",
    emailId : "ram@gmail.com",
    mob : "9876543210",
    fullName : function() {
         return this.firstName + " " + this.lastName;
    },
    mySkills : {
        skill1 : "Java",
        skill2 : "HTML",
        skill3 : "JS"
    }
};

let userObj = "";

for (let x in user) {
    userObj += user[x] + " ";
}

document.getElementById("user").innerHTML = userObj;

console.log("Ram : " + user.emailId + "" + user.mob + "" + "Skill "
    + " " + user.mySkills.skill1);

console.log(user["mySkills"]["skill2"]);

const user1 = new Object();
user1.firstName = "Ajit";
user1.lastName = "kumar";
user1.emailId = "ajit@gmail.com";
user1.password = "ajit1234";
user1.mob = "9876543210";
user1.fullName = function() {
    return (this.firstName + " " + this.lastName).toUpperCase();
}

//delete user1.mob;
//delete user1["mob"]

console.log(user1.fullName() + " " + user1.emailId + " " + user1.mob);