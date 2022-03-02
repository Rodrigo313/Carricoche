<template>
  <div class="main-container">
    <h1>Nuestras Redes</h1>
    <div class="find-me-container">
      <img
        ref="img"
        src="../assets/logo-coche.jpg"
        alt="Logo coche"
        @mouseenter="imagePopup"
        @mouseleave="imagePopdown"
      />
      <div class="icons">
        <NuestrasRedesIcons
          class="email"
          title="email"
          content="rodrigopascual1@hotmail.com"
        />
        <NuestrasRedesIcons
          title="github"
          content="carricoche-git"
          link="https://github.com/Rodrigo313/Carricoche"
        />
        <NuestrasRedesIcons
          title="instagram"
          content="carricoche-ig"
          link="https://www.instagram.com/rodriip39_/"
        />
        <NuestrasRedesIcons
          title="Twitter"
          content="carricoche-tw"
          link="https://twitter.com/Rodriip13_"
        />
        <NuestrasRedesIcons
          title="Milanuncios"
          content="carricoche-ma"
          link="https://www.milanuncios.com/mi-cuenta/"
        />
        <NuestrasRedesIcons
          title="Twitch"
          content="Carricoche-twtv"
          link="https://www.twitch.tv/settings/profile"
        />
      </div>
    </div>
  </div>
</template>

<script>
import { TimelineLite } from "gsap/dist/gsap";

import NuestrasRedesIcons from "../components/NuestrasRedesIcons.vue";
export default {
  name: "NuestrasRedes",
  components: {
    NuestrasRedesIcons,
  },
  methods: {
    imagePopup() {
      const img = this.$refs.img;
      const tl = new TimelineLite();

      tl.to(img, {
        boxShadow: "0px 0px 15px 0px rgba(0,0,0,0.55)",
        scale: 1.1,
      });
    },
    imagePopdown() {
      const img = this.$refs.img;
      const tl = new TimelineLite();

      tl.to(img, {
        scale: 1,
      });
    },
  },
};
</script>

<style scoped>
.main-container {
  padding-bottom: 20em;
  display: flex;
  flex-flow: column nowrap;
  align-items: center;
}
h1 {
  margin-top: 1em;
  text-align: center;
}
img {
  border: 10px solid white;
  border-radius: 50%;
  width: clamp(200px, 20vw, 20vw);
}
.find-me-container {
  margin-top: 3em;
  width: 80vw;
  display: flex;
  flex-flow: row wrap;
  justify-content: space-around;
  align-items: center;
}
.icons {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 2em;
}

@media (max-width: 700px) {
  img {
    margin-bottom: 2em;
  }
  .icons {
    display: grid;
    grid-template-columns: 1fr;
    gap: 1.2em;
  }
}
</style>