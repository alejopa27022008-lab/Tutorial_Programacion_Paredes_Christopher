/*
=================================
MODO OSCURO
=================================
*/

const darkModeBtn =
document.getElementById("darkModeBtn");

darkModeBtn.addEventListener("click", () => {

    document.body.classList.toggle("dark-mode");

    if(
        document.body.classList.contains("dark-mode")
    ){
        localStorage.setItem(
            "modo",
            "oscuro"
        );
    }
    else{
        localStorage.setItem(
            "modo",
            "claro"
        );
    }

});

/*
=================================
CARGAR PREFERENCIA
=================================
*/

if(
    localStorage.getItem("modo")
    ===
    "oscuro"
){
    document.body.classList.add(
        "dark-mode"
    );
}

/*
=================================
BUSCADOR
=================================
*/

const buscador =
document.getElementById("searchInput");

if(buscador){

    buscador.addEventListener(
        "keyup",
        function(){

            let texto =
            buscador.value.toLowerCase();

            let tarjetas =
            document.querySelectorAll(".card");

            tarjetas.forEach(card => {

                let contenido =
                card.textContent.toLowerCase();

                if(
                    contenido.includes(texto)
                ){
                    card.style.display =
                    "block";
                }
                else{
                    card.style.display =
                    "none";
                }

            });

        }
    );

}