FROM ubuntu
WORKDIR /app
COPY ./hola.py .
RUN apt update
RUN apt install python3 -y
CMD ["python3", "hola.py"]
