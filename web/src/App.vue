<template>
  <div>
    <div>Boss 昵称：{{ bot_name0 }} {{ bot_name1}} </div>
    <div>Boss 战力：{{ bot_rating0 }} {{ bot_rating1 }} </div>
  </div>
  <router-view></router-view>
</template>



<script>
import $ from 'jquery';
import { ref } from 'vue';

export default{
  name: "App",
  setup: () => {
    let bot_name0 = ref("");
    let bot_rating0 = ref("");
    let bot_name1 = ref("");
    let bot_rating1 = ref("");
    $.ajax({
      url: "http://127.0.0.1:3000/pk/getbotinfo1/",
      type : "get",
      success: resp => {
        console.log(resp);
        bot_name0.value = resp[0].name;
        bot_rating0.value = resp[0].rating;
        bot_name1.value = resp[1].name;
        bot_rating1.value = resp[1].rating;
      }
    });
    return {
      bot_name0,
      bot_rating0,
      bot_name1,
      bot_rating1,
    }
  }
}
</script>
<style>

</style>
