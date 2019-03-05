<template>
    <div class="view-main">
        <li v-for="offer in msg" :key="offer.id">
            <div class="offer-card">
                <p>Brand: </p>
                <h1>{{offer.title}}</h1>
                <p>{{offer.description}}</p>
                <b-button class="button-main button-secondary">No thanks</b-button>
                <b-button class="button-main">Interested</b-button>
            </div>
        </li>
    </div>
</template>

<script>
    export default {
        name: "offer",
        props: {
            msg: String
        }
    }
</script>

<style scoped>

    li {
        list-style-type: none;
    }

    .offer-card {
        padding: 16px;
        border: 3px solid #f5f5f5;
        margin-bottom: 24px;
    }

</style>