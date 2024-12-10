usando o ubuntu, rode esses códigos 

1: sudo apt-get install git wget flex bison gperf python3 python3-pip python3-setuptools cmake ninja-build ccache libffi-dev libssl-dev dfu-util libusb-1.0-0

2: mkdir -p ~/esp
cd ~/esp
git clone -b release/v4.3 --recursive https://github.com/espressif/esp-idf.git


3: cd ~/esp/esp-idf
./install.sh esp32


Agora, pra não ter que toda vez fazer essas coisas todas do começo, faça no terminal:
  1: gedit ~/.bashrc
  2: cola esse comando no fim do arquivo: . $HOME/esp/esp-idf/export.sh
  3: salva (dã)
  4: no terminal, ao terminar isso tudo, rode: source ~/.bashrc

E pronto :)








