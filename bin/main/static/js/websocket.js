
            var ws;
            var message=document.getElementById("message");
        
            // if(ws!==undefined && ws.readyState!==WebSocket.CLOSED){
            //     writeResponse("WebSocket is already opened.");
            //     return;
            // }
            //웹소켓 객체 만드는 코드
            ws=new WebSocket("ws://localhost:8088/accesstime");
            
            ws.onopen=function(message){
                if(message===undefined) return;
                
                writeResponse(message);
            };
            ws.onmessage=function(e){
    
                message.value += e.data;
            };
            ws.onclose=function(message){
                writeResponse("Connection closed");
            }
        
        
        function send(){
            var text=document.getElementById("messageinput").value+","+document.getElementById("sender").value;
            ws.send(text);
            text="";
        }
        
        function closeSocket(){
            ws.close();
        }
        function writeResponse(text){
            message.innerHTML+= text;
        }