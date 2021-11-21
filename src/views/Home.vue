<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col"><img alt="Logo coche" src="../assets/logo-coche.jpg"></div>
        <div class="col"><img alt="Logo coche 2" id="logoLargo" src="../assets/logo-coche2.jpg"></div>
        <div class="home">

        </div>
      </div>
    </div>
  </body>
</template>

<script>
export default {

}
</script>

<style scoped>
img{
  width: 200px;
  height: 100px;
  margin-top: 30px;
  /*position: fixed;*/
  left: 500px;
  top: 0;
  right: 0;
}
#logoLargo{
  width: 580px;
  margin-right: 360px;
}
.home{
  background-image: url("../assets/coche.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;
  width: 1200px;
  height: 600px;
  margin-top: 150px;

}
</style>
