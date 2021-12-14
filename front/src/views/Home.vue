<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <!--<div class="col"><img alt="Logo coche" src="../assets/logo-coche.jpg"></div>-->
        <carousel :slides="slides"></carousel>
        <div class="home">

        </div>
      </div>
    </div>
  </body>
</template>

<script>
import Carousel from "./components/Carousel.vue";
export default {
  components: {Carousel},
      data: () => ({
        slides: [
          "https://i.picsum.photos/id/1071/1400/700.jpg?hmac=rPo94Qr1Ffb657k6R7c9Zmfgs4wc4c1mNFz7ND23KnQ",
          "https://i.picsum.photos/id/111/1400/700.jpg?hmac=leq8lj40D6cqFq5M_NLXkMYtV-30TtOOnzklhjPaAAQ",
          "https://i.picsum.photos/id/183/1400/700.jpg?hmac=908ZBWKqGdL9kio38tCq2ViwMm3DjLUtkjU_6SWNa9k",
          "https://i.picsum.photos/id/514/1400/700.jpg?hmac=OmmsoWSTgOdsCjg94wlT1VqyJPSPBypTtr-wxfTeLLI",
          "https://i.picsum.photos/id/133/1400/700.jpg?hmac=0X5o8bHUICkOIvZHtykCRL50Bjn1N8w1AvkenF7n93E"
        ],
      }),
    }
</script>

<style scoped>
img{
  width: 200px;
  height: 100px;
  margin-top: 30px;
  position: fixed;
  left: 500px;
  top: 0;
  right: 0;
}
.home{
  background-image: url("../assets/coche.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;
  width: 1400px;
  height: 700px;
  margin-top: 150px;
}
</style>
