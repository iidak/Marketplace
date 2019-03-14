<template>

    <div>
        <form class="fields" id="login" v-on:submit.prevent="login">
            <h1 class="title">Log in</h1>
            <div class="field">
                <label>Email</label>
                <b-input v-model="username" type="email" class="input"></b-input>
            </div>
            <div class="field">
                <label>Password</label>
                <b-input v-model="password" type="password" class="input"></b-input>
            </div>

            <b-button type="submit" class="button-main">Next</b-button>
        </form>
    </div>

</template>

<script>
    import {AUTH_REQUEST} from "../store/constants";

    export default {
        name: 'login',
        data() {
            return {
                username: '',
                password: ''
            }
        },
        methods: {
            login () {
                const { username, password } = this;
                this.$store.dispatch(AUTH_REQUEST, {username, password}).then(() => {
                    this.$router.push('/influencerPage');
                });
            }
        }
    }
</script>

<style scoped>
    h3 {
        margin: 40px 0 0;
    }
    ul {
        list-style-type: none;
        padding: 0;
    }
    li {
        display: inline-block;
        margin: 0 10px;
    }
    a {
        color: #42b983;
    }
</style>
