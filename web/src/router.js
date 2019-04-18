import Vue from 'vue'
import Router from 'vue-router'
import BrandPage from './brand/BrandPage.vue'
import InfluencerPage from './influencer/InfluencerPage.vue'
import LandingPage from './LandingPage.vue'
import BrandSignup from './brand/BrandSignup.vue'
import Success from './components/Success.vue'
import SuccessEmails from './components/SuccessEmails.vue'
//import store from "./store";

Vue.use(Router)


const router = new Router({
    mode: 'history',
    routes: [
        {
          path: '/',
          redirect: '/landingPage'
        },
        {
            path: '/brandPage',
            name: 'brandpage',
            component: BrandPage
        },
        {
            path: '/influencerPage',
            name: 'infleuncerpage',
            component: InfluencerPage
        },
        {
            path: '/landingPage',
            name: 'landingPage',
            component: LandingPage
        },
        {
            path: '/brandSignup',
            name: 'brandSignup',
            component: BrandSignup
        },
        {
            path: '/successPost',
            name: 'successPost',
            component: Success
        },
        {
            path: '/successEmails',
            name: 'successEmails',
            component: SuccessEmails
        }
    ]
});

export default router;