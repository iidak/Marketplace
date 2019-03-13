<template>
    <div>
        <form class="fields">
            <h1 class="title">Link to your social platforms</h1>

            <div class="field">
                <label>Instagram account</label>
                <b-input v-model="instagram" type="text" class="input"/>
            </div>

            <div class="field">
                <label>Youtube account</label>
                <b-input v-model="youtube" type="text" class="input"/>
            </div>

            <router-link to="/influencerSignupWelcome" class="router-link-text-button">
                <b-button type="submit" class="button-main" @click="postPost">Next</b-button>
            </router-link>

        </form>
    </div>
</template>

<script>
    export default {
        name: "influencer-signup-name",

        data() {
            return {
                instagram: "",
                youtube: ""
            }
        },

        methods: {
            postPost() {
                //axios.post('http://localhost:8080/input', {email: this.email, password: this.password, role: "influencer"}).then(response => {this.name = response.data})
            }
        }
    }
</script>

<style scoped>

</style>