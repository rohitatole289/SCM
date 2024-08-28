console.log("script loaded");

let currentTheme=getTheme();
changeTheme()

function changeTheme(){
 document.querySelector('html').classList.add(currentTheme);
 const changeThemeButton= document.querySelector('#theme_change_button')
 changeThemeButton.addEventListener("click", (event) => {
    document.querySelector('html').classList.remove(currentTheme);
 if(currentTheme == "dark"){
   currentTheme="light";
 }else
   {
    currentTheme="dark";
   }

   setTheme(currentTheme);
   
   changeThemeButton.querySelector('span').textContent= currentTheme=='light' ?'Dark':" Light"
});
 }

function setTheme(theme){
    localStorage.setItem("theme",theme);
    document.querySelector('html').classList.add(currentTheme);

}
function getTheme(){
  let theme= localStorage.getItem("theme");
  if(theme) return theme;
  else return "light";
  
}
   