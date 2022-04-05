import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import VueCookies from 'vue-cookies'

createApp(VueCookies).mount('#app')
createApp(App).use(router).mount('#app')



