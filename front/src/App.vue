<template>
<div class="col"><img id="logo" alt="Logo coche" src="./assets/logo-coche.jpg"></div>
  <div id="menu">

    <router-link to="/">Inicio</router-link> |

    <router-link to="/anuncios">Anuncios</router-link> |

    <router-link to="/insertar">Insertar</router-link> |

    <router-link to="/modificar">Modificar</router-link> |

    <router-link to="/nuestrasRedes">Nuestras Redes</router-link> |

    <router-link to="/eliminar">Eliminar</router-link>
  </div>
  <router-view/>
  <Cookies position="bottom"/>
</template>

<script>
import Cookies from './components/Cookies.vue'

export default {
      components:{
        Cookies
      }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;

}
#menu {
  padding: 40px;
  margin-top: 35px;
  margin: 0 auto;
  left: 670px;
  top: 0;
  right: 0;
  width: 30%;
  background-color: white;
  font-size: large;
}
#menu a {
  font-weight: bold;
  color: black;
}
#menu a.router-link-exact-active {
  color: white;
  text-shadow:
		0 0 5px rgb(255, 0, 0),
		0 0 10px rgb(255, 0, 0),
		0 0 20px rgb(255, 0, 0),
		0 0 40px rgb(127, 38, 38),
		0 0 80px rgb(127, 38, 38),
		0 0 90px rgb(127, 38, 38),
		0 0 100px rgb(127, 38, 38),
		0 0 140px rgb(127, 38, 38),
		0 0 180px rgb(127, 38, 38);
}
#logo{
  width: 100px;
  height: 100px;
  margin-top: 30px;
  left: 550px;
  top: 0;
  right: 0;
}
</style>
