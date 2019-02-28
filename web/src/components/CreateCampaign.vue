<template>
    <div>
        <h1>Create campaign: </h1>
        <input type="text" placeholder="Campaign title">
        <input type="text" placeholder="Campaign description">
        <button type="submit" class="main-button" @click="addCampaign">Next</button>
    </div>
</template>

<script>
    import axios from "axios";
    export default {
        name: "create-campaign",
        data() {
            return {
                title: "",
                body: ""
            }
        },
        methods: {
            addCampaign() {
                axios.post('http://localhost:8080/addCampaign', {title: this.title, body: this.body}).then(response => {this.title = response.data})
            }
        }
    }
</script>

<style scoped>

</style>