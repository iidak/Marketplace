<template>
    <div>
        <input type="text" class="signup-input" placeholder="Test">
        <div v-for="todo in todos" :key="todo.id" class="todo-item">
            {{ todo.title }}
        </div>
    </div>
</template>

<script>
    export default {
        name: "todo-list.vue",
        data() {
            return {
                newTodo: "",
                todos: [
                    {
                        'id': 1,
                        'title': "Finish Vue screencast",
                        'completed': false
                    },
                    {
                        'id': 2,
                        'title': "Take over the world",
                        'completed': false
                    }
                ]
            }
        }
    }
</script>

<style>

</style>