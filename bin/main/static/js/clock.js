let clock = function(){
    let date = new Date();
    let hour = date.getHours();
    let minute = date.getMinutes();
    let second = date.getSeconds();

    let day = date.getDate();
    let month = date.getMonth()+1;
    let year = date.getFullYear();

    if (day < 10) day = '0' + day;
    if (month < 10) month = '0' + month;
    if (hour < 10) hour = '0' + hour;
    if (minute < 10) minute = '0' + minute;
    if (second < 10) second = '0' + second;

    let timetoday = month + '월' + day + '월' + year + '년';
    let timenow = hour + ':' + minute + ':' + second;

    let dayshow = document.querySelector('#day p');
    let timeshow = document.querySelector('#clock p');
    dayshow.textContent = timetoday;
    timeshow.textContent = timenow;
}

setInterval(clock, 1000);