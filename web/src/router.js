import Vue from 'vue'
import Router from 'vue-router'
import SignUp from './components/SignUp.vue'
import TodoList from './components/TodoList.vue'
import BrandPage from './BrandPage.vue'
import InfluencerPage from './InfluencerPage.vue'
import LandingPage from './LandingPage.vue'

Vue.use(Router)

export default new Router({
    routes: [
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
        }
    ]
})