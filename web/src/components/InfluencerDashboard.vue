<template>
    <div>
        <h1 class="title">Campaigns: </h1>
        <p>Browse campaigns and see contact details once you press Interested.</p>
        <Offer v-bind:msg="offers">Test</Offer>
        <p></p>
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