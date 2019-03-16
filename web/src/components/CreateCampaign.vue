<template>
    <div>
        <form class="fields">
            <h1 class="title">Create campaign: </h1>
            <b-form-group
                    :invalid-feedback="errors.first('brand')"
                    :state="!errors.has('brand')"
                    class="field">
                <label>Brand name: </label>
                <b-form-input
                        :state="errors.has('brand') ? false : null"
                        v-model="brandName"
                        v-validate="'required|min:3'"
                        data-vv-as="field"
                        name="brand"
                        type="text"
                        class="input"></b-form-input>
            </b-form-group>

            <b-form-group
                    :invalid-feedback="errors.first('title')"
                    :state="!errors.has('title')"
                    class="field">
                <label>Campaign title: </label>
                <b-form-input
                        :state="errors.has('title') ? false : null"
                        v-validate="'required|min:3'"
                        v-model="title"
                        data-vv-as="field"
                        name="title"
                        type="text"
                        class="input"></b-form-input>
            </b-form-group>

            <b-form-group
                    :invalid-feedback="errors.first('description')"
                    :state="!errors.has('description')"
                    class="field">
                <label>Description: </label>
                <b-form-textarea
                        :state="errors.has('description') ? false : null"
                        v-validate="'required|min:3'"
                        v-model="description"
                        data-vv-as="field"
                        name="description"
                        type="text"
                        class="input"></b-form-textarea>
            </b-form-group>

            <b-form-group
                    :invalid-feedback="errors.first('email')"
                    :state="!errors.has('email')"
                    class="field">
                <label>Contact email: </label>
                <b-form-input
                        :state="errors.has('email') ? false : null"
                        v-model="email"
                        v-validate="'required|email'"
                        name="email"
                        type="email"
                        class="input"
                ></b-form-input>
            </b-form-group>

            <router-link to="" class="router-link-text-button">
                <b-button type="submit" class="button-main" @click="submit">Add</b-button>
            </router-link>
        </form>
    </div>
</template>

<script>
    import axios from "axios";
    import router from "../router.js"

    export default {
        name: "create-campaign",
        data() {
            return {
                title: "",
                description: "",
                brandName: "",
                email: ""
            }
        },
        methods: {
            addCampaign() {
                axios.post('http://localhost:8080/addCampaign',
                    {
                        title: this.title,
                        description: this.description,
                        email: this.email, brandName:
                        this.brandName}).then(function() {
                            router.push('/landingPage');
                })
            },

            submit() {
                this.$validator.validateAll().then((result => {
                    if (result) {
                        this.addCampaign()
                    }
                }))
            }
        }
    }
</script>

<style scoped>

</style>