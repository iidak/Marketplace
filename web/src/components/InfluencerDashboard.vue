<template>
    <div>
        <h1>Influencer dashboard: </h1>
        <h2>New offers: </h2>
        <Offer v-bind:msg="offers">Test</Offer>
        <p></p>
        <h2>Pending: </h2>
        <h2>Matched: </h2>
    </div>
</template>

<script>
    import Offer from './Offer.vue'
    import axios from "axios";

    export default {
        name: "influencer-dashboard",
        components: {
            Offer,
        },
        data() {
            return {
                offers: null
            }
        },
        mounted () {
            axios.get('http://localhost:8080/getCampaigns').then(response => (this.offers = response.data));
        }
    }
</script>

<style scoped>

</style>