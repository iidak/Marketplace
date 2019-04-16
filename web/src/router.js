import Vue from 'vue'
import Router from 'vue-router'
import SignUp from './components/SignUp.vue'
import TodoList from './components/TodoList.vue'
import BrandPage from './brand/BrandPage.vue'
import InfluencerPage from './influencer/InfluencerPage.vue'
import LandingPage from './LandingPage.vue'
import BrandSignup from './brand/BrandSignup.vue'
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
            path: '/signup',
            name: 'signup',
            component: SignUp
        },
        {
            path: '/todolist',
            name: 'todolist',
            component: TodoList
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
        }
    ]
});

/*
router.beforeEach((to, from, next) => {
    const publicPages = ['/login', '/landingPage', '/influencerSignup', '/brandSignup'];
    const authRequired = !publicPages.includes(to.path);
    const loggedIn = store.getters.isAuthenticated;

    if (authRequired && !loggedIn) {
        return next('/login');
    }
    next();
});*/

export default router;