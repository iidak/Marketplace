import Vue from 'vue'
import Router from 'vue-router'
import SignUp from './components/SignUp.vue'
import TodoList from './components/TodoList.vue'

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
        }
    ]
})