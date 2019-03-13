import Vue from 'vue'
import App from './App.vue'
import router from './router'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import VeeValidate from 'vee-validate';
import store from './store'

Vue.config.productionTip = false;
Vue.use(BootstrapVue);
Vue.use(VeeValidate);

new Vue({
    render: h => h(App),
    router,
    store
}).$mount('#app');
