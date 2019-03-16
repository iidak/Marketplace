<template>
    <div>
        <router-link to="/brandPage">
            <p>Switch to Brand</p>
        </router-link>
        <div class="view-main">
            <InfluencerDashboard></InfluencerDashboard>
        </div>
    </div>
</template>

<script>
    import InfluencerDashboard from '../components/InfluencerDashboard.vue'

    export default {
        name: "influencer-page",
        components: {
            InfluencerDashboard
        }
    }
</script>

<style scoped>

</style>