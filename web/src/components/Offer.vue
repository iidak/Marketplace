<template>
    <div class="view-main">
        <li v-for="offer in msg" :key="offer.id">
            <div class="offer-card">
                <p>Brand:</p>
                <h1>{{offer.title}}</h1>
                <p>{{offer.description}}</p>
                <b-button class="button-main" @click="showModal(offer)">Interested</b-button>
            </div>
        </li>
        <b-modal ref="myModalRef" hide-footer title="">
            <div class="d-block text-center">
                <h3>Write {{brand}} an email pls</h3>
                <p>Email: {{email}}</p>
            </div>
            <b-button class="button-main" @click="hideModal">Done</b-button>
        </b-modal>
    </div>
</template>

<script>
    export default {
        name: "offer",
        props: {
            msg: Array,
        },
        data() {
            return {
                email: "",
                brand: ""
            }
        },
        methods: {
            showModal: function(offer) {
                this.email = offer.email;
                this.brand = offer.brandName;
                this.$refs.myModalRef.show()
            },
            hideModal() {
                this.$refs.myModalRef.hide()
            }

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
        max-width: 640px;
        margin-left: auto;
        margin-right: auto;
    }

</style>