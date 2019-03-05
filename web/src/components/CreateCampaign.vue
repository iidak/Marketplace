<template>
    <div class="view-main">
        <h1>Create campaign: </h1>
        <b-form-input v-validate="required" name="fieldName" v-model="title" type="text" placeholder="Campaign title"/>
        <span>{{ errors.first('fieldName') }}</span>
        <b-form-textarea id="input-default" type="text" placeholder="Campaign description" v-model="description"/>
        <b-button type="submit" class="button-main" @click="addCampaign">Next</b-button>
    </div>
</template>

<script>
    import axios from "axios";
    export default {
        name: "create-campaign",
        data() {
            return {
                title: "",
                description: ""
            }
        },
        methods: {
            addCampaign() {
                axios.post('http://localhost:8080/addCampaign', {title: this.title, description: this.description}).then(response => {this.title = response.data})
            }
        }
    }
</script>

<style scoped>

</style>