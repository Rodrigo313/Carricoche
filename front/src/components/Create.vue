<template>
  <div class="create">
      <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      </head>
      <body>
        <form>
          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Coche</span>
              <input type="text" class="form-control" aria-label="Coche" aria-describedby="basic-addon1" v-model="var1" @keyup="habilitarBoton(1)" required>
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Provincia</span>
              <select class="form-select" aria-label="Default select example" v-model="var2" @change="habilitarBoton(2)" required>
                  <option v-for="(provincia, index) in provincias" :key="index" v-bind:value="provincia.id_provincia">{{provincia.nombre}}</option>
              </select>
          </div>
          <br>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Teléfono</span>
              <input type="text" pattern="[0-9]+" maxlength="9" class="form-control" aria-label="Teléfono" aria-describedby="basic-addon2" v-model="var3" @keyup="habilitarBoton(3)" required>
          </div>

          <div class="input-group mb-3">
              <input type="email" class="form-control" placeholder="ejemplo@gmail.com" aria-label="Correo electrónico" aria-describedby="basic-addon3" v-model="var4" @keyup="habilitarBoton(4)" required>
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Precio</span>
              <input type="number" class="form-control" aria-label="Precio" aria-describedby="basic-addon2" v-model="var5" @keyup="habilitarBoton(5)" required>
          </div>

            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Segunda mano</span>

              <div class="form-check">
                <input id="segunda" type="checkbox" name="segunda" @click="cambio()">
              </div>
          </div>

          <div class="input-group mb-3">
              <button id="boton" type="submit" class="btn btn-primary mb-3" @click="enviar" disabled>Crear</button>
          </div>
        </form>
      </body>
  </div>
</template>

<script>
import axios from 'axios';
export default {

  data(){
      return{
          provincias: [],
          var1: '',
          var2: '',
          var3: '',
          var4: '',
          var5: '',
          var6: false,
          varCoche: false,
          varProvincia: false,
          varTelefono: false,
          varCorreo: false,
          varPrecio: false
      }
  },
  methods:{
    obtenerProvincias(){
       axios.get("http://localhost:8080/carricoche/v1/provincias").then((response) => {
          this.provincias = response.data
      })
    },
    enviar(){
        let post = {
            coche: this.var1,
            id_provincia: this.var2,
            telefono: this.var3,
            correo_electronico: this.var4,
            precio: this.var5,
            segunda_mano: this.var6
        };
        axios.post('http://localhost:8080/carricoche/v1/anuncios', post)
        .then((result) => {
            console.log(result)
        });
    },
    cambio(){
        this.var6 = !this.var6;
    },
    habilitarBoton(index){
      switch(index){
        case 1:
          if(this.var1 == ""){
            this.varCoche = false;
          }else{
            this.varCoche = true;
          }
        break;
        case 2:
          this.varProvincia = true;
        break;
        case 3:
          if(this.var3 == ""){
            this.varTelefono = false;
          }else if(this.var3.length == 9){
            this.varTelefono = true;
          }
        break;
        case 4:
          if(this.var4 == ""){
            this.varCorreo = false;
          }else if(this.var4.includes("@")){
            this.varCorreo = true;
          }
        break;
        case 5:
          if(this.var5 == ""){
            this.varPrecio = false;
          }else{
            this.varPrecio = true;
          }
        break
      }
      if(this.varCoche && this.varProvincia && this.varTelefono && this.varCorreo && this.varPrecio){
        document.getElementById("boton").disabled = false;
      }else{
        document.getElementById("boton").disabled = true;
      }
    }
  },
  created(){
      this.obtenerProvincias();
  }
}
</script>
<style scoped>
input[name="flexRadioDefault"] {
  margin-left: 10px;
}
input[name="flexRadioDefault2"] {
  margin-left: 50px;
}
#segunda{
    width: 45px;
    height: 45px;
}
</style>
