<template>
  <div class="nuestras-redes-icons-main-container" @click="openLink">
    <div class="nuestras-redes-icons-header">
      <img :src="require(`../assets/icons/${title}.png`)" :alt="title" />
      <div class="horizontal-divider"></div>
      <strong> {{ title }} </strong>
    </div>
    <p>{{ content }}</p>
  </div>
</template>

<script>
export default {
  name: "NuestrasRedesIcons",
  props: {
    title: {
      type: String,
      required: true
    },
    content: {
      type: String,
      required: true
    },
    link: {
      type: String,
      required: false
    }
  },
  methods: {
    openLink() {
      if (this.title === "email") {
        return;
      }
      window.open(this.link, "_blank", "noopener");
    }
  }
};
</script>

<style scoped>
.horizontal-divider {
  width: 1px;
  background-color: #313131;
  height: 30px;
}
.nuestras-redes-icons-main-container {
  cursor: pointer;
  display: flex;
  flex-flow: column nowrap;
  justify-content: center;
  align-items: center;
  background-color: darkred;
  border-radius: 20px;
  transition: all 0.2s ease-in-out;
}

.nuestras-redes-icons-main-container:hover {
  background-color: red;
  box-shadow: 0px 0px 14px 0px rgba(255, 0, 0, 0.4);
}

.nuestras-redes-icons-main-container:hover img {
  opacity: 0.9;
}

.nuestras-redes-icons-main-container:hover strong {
  opacity: 0.9;
}

.nuestras-redes-icons-main-container:hover p {
  opacity: 0.9;
}
img {
  width: clamp(35px, 2vw, 2vw);
  opacity: 0.5;
  transition: opacity 0.2s ease-in-out;
}
strong {
  font-size: clamp(16px, 1.1vw, 1.1vw);
  opacity: 0.5;
  transition: opacity 0.2s ease-in-out;
}
p {
  font-size: clamp(16px, 1vw, 1vw);
  padding: 0 2em;
  opacity: 0.5;
  transition: opacity 0.2s ease-in-out;
}
.nuestras-redes-icons-header {
  display: flex;
  flex-flow: row nowrap;
  align-items: center;
}

.nuestras-redes-icons-header * {
  margin: 1em;
}
</style>