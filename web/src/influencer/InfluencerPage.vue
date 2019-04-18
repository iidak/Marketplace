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

<style>

    .fields {
        padding-left: 48px;
        padding-right: 48px;
        max-width: 480px;
        margin: 0 auto;
    }

    .field {
        margin-bottom: 16px;
        margin-top: 16px;
    }

    .label {
        text-align: left;
    }

    .img {
        padding: 24px;
    }

</style>