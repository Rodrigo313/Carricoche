import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import VueCookies from 'vue-cookies'
import InFeedAdsense from 'vue-google-adsense/dist/InFeedAdsense.min.js'

createApp(VueCookies).mount('#app')
createApp(App).use(router).mount('#app')
Vue.use(require('vue-script2'))
Vue.use(InFeedAdsense)


