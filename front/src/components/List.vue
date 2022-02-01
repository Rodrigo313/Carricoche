<template>
  <div>
      <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      </head>
    <body>

        <form>
            <div>
                        <h2>Comprar coche</h2>
            <h4>Debe rellenar todos los campos</h4>

            <span>

                <div>
                    <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Nombre</span>
              <input type="text" class="form-control" aria-label="Nombre" aria-describedby="basic-addon1">
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Apellidos</span>
              <input type="text" class="form-control" aria-label="Nombre" aria-describedby="basic-addon1">
          </div>

          <br>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Teléfono</span>
              <input type="text" class="form-control" aria-label="Teléfono" aria-describedby="basic-addon2">
          </div>


          <div class="input-group mb-3">
              <input type="text" class="form-control" placeholder="ejemplo@gmail.com" aria-label="Correo electrónico" aria-describedby="basic-addon3">
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Dirección</span>
              <input type="text" class="form-control" aria-label="Dirección" aria-describedby="basic-addon2">
          </div>

          <h4>Opciones de descuento</h4>

            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Familia numerosa(10%)</span>
              <div class="form-check">
                <input id="descuento" type="radio" :value="familia_numerosa" v-model="descuento" @click="calcularDescuento">
              </div>

              <span class="input-group-text" id="basic-addon2">Mayor de 55 años(15%)</span>
              <div class="form-check">
                <input id="descuento" type="radio" :value="viejo" v-model="descuento" @click="calcularDescuento">
              </div>
          </div>
          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">El precio final es de</span>
              <input type="text" class="form-control" aria-label="precio_final" aria-describedby="basic-addon2" v-model="precio_final">
          </div>

                    <div class="input-group mb-3">
                        <button type="submit" class="btn btn-primary mb-3" @click="borrar">Comprar</button>
                    </div>
                </div>
            </span>
            </div>
        </form>
        <br>
    </body>
  </div>
</template>

<script>
import axios from "axios";
export default{
   props:[
       "informacionCompra"
   ],
   data(){
       return{
           nombre:"",
           apellidos:"",
           ubicacion: "",
           numero: "",
           correo: "",
           descuento: "",
           familia_numerosa: false,
           precio_final: 0,
           coche: {},
           id: ""
       }
   },
   created(){
        axios.get("http://localhost:8080/carricoche/v1/anuncios/" + this.informacionCompra).then((response) => {
            this.anuncio = response.data[0];
        }),
        axios.get("http://localhost:8080/carricoche/v1/provincias").then((response) => {
            this.provincias = response.data
      })
   },
   methods: {
        datosCompra: function(nombre, apellidos, direccion, telefono, correo_electronico, descuento, id_anuncio){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.ubicacion = direccion;
            this.numero = telefono;
            this.equipo = correo_electronico;
            this.descuento = descuento;
            this.id = id_anuncio;
        },
        calcularDescuento(){
            /*this.coche = {
                        descripcion: this.anuncio.coche,
                        precio: this.anuncio.precio,
                        segunda_mano: this.anuncio.segunda_mano,
                        familia_numerosa: this.descuento,
                        descuento: this.descuento
                        }*/
            console.log(this.descuento);
            axios.post('http://localhost:8080/carricoche/v1/descuento/aplicar', coche).then((response) => {
            this.precio_final = response.data
      })
        },
        borrar(){
            axios.delete('http://localhost:8080/carricoche/v1/anuncios/'+this.informacionCompra);
            location.reload();
        }
   }
}
</script>

<style>
li {
    list-style: none;
}
#descuento{
    width: 45px;
    height: 45px;
    margin-right: 10px;
}
</style>